package br.embrapa.resource;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.embrapa.event.RecursoCriadoEvent;
import br.embrapa.model.AreaManejoFlorestal;
import br.embrapa.repository.AreaManejoFlorestalRepository;
import br.embrapa.repository.filter.AreaManejoFlorestalFilter;
import br.embrapa.service.AreaManejoFlorestalService;

@RestController
@RequestMapping("/areamanejoflorestal")
public class AreaManejoFlorestalResource {
	
	
	@Autowired
	private AreaManejoFlorestalRepository areaManejoFlorestalRepository;

	@Autowired
	private AreaManejoFlorestalService areaManejoFlorestalService;
	
	
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_EMPRESA') and #oauth2.hasScope('read')")
	public Page<AreaManejoFlorestal> pesquisar(AreaManejoFlorestalFilter areaManejoFlorestalFilter, Pageable pageable){
		return areaManejoFlorestalRepository.filtrar(areaManejoFlorestalFilter, pageable);
	}
	
		
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_EMPRESA') and #oauth2.hasScope('write')")
	public ResponseEntity<AreaManejoFlorestal> criar(@RequestBody AreaManejoFlorestal areaManejoFlorestal, HttpServletResponse response) {
		AreaManejoFlorestal areaManejoFlorestalSalva = areaManejoFlorestalRepository.save(areaManejoFlorestal);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, areaManejoFlorestalSalva.getCdProjeto()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(areaManejoFlorestalSalva);
	}
	
	@GetMapping("/{cdEmpresa}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_EMPRESA') and #oauth2.hasScope('read')")
	public ResponseEntity <AreaManejoFlorestal>buscarPeloCodigo(@PathVariable Long cdEmpresa) {
		AreaManejoFlorestal areaManejoFlorestal = areaManejoFlorestalRepository.findOne(cdEmpresa);
		return areaManejoFlorestal != null ? ResponseEntity.ok(areaManejoFlorestal) : ResponseEntity.notFound().build();
		
	}
	
	@DeleteMapping("/{cdEmpresa}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_EMPRESA') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long cdEmpresa) {
		areaManejoFlorestalRepository.delete(cdEmpresa);
	}
	
	@PutMapping("/{cdEmpresa}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_EMPRESA') and #oauth2.hasScope('write')")
	public ResponseEntity<AreaManejoFlorestal> atualizar(@PathVariable Long cdEmpresa, @Valid @RequestBody AreaManejoFlorestal areaManejoFlorestal) {
		AreaManejoFlorestal areaManejoFlorestalSalva = areaManejoFlorestalService.atualizar(cdEmpresa, areaManejoFlorestal);
		return ResponseEntity.ok(areaManejoFlorestalSalva);
	}
	
	
	
	
	

}
