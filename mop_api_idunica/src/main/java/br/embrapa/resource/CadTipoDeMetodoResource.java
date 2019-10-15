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
import br.embrapa.model.CadTipoDeMetodo;
import br.embrapa.repository.CadTipoDeMetodoRepository;
import br.embrapa.repository.filter.CadTipoDeMetodoFilter;
import br.embrapa.repository.projections.ResumoCadTipoDeMetodo;
import br.embrapa.service.CadTipoDeMetodoService;

@RestController
@RequestMapping("/cadtipodemetodo")
public class CadTipoDeMetodoResource {

	@Autowired
	private CadTipoDeMetodoRepository cadTipoDeMetodoRepository;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADTIPODEMETODO') and #oauth2.hasScope('read')")
		public Page<CadTipoDeMetodo> Pesquisar(CadTipoDeMetodoFilter cadTipoDeMetodoFilter, Pageable pageable) {
		return cadTipoDeMetodoRepository.filtrar(cadTipoDeMetodoFilter, pageable);
	}
	
	@GetMapping(params = "resumo")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADTIPODEMETODO') and #oauth2.hasScope('read')")
	public Page<ResumoCadTipoDeMetodo> resumir(CadTipoDeMetodoFilter cadTipoDeMetodoFilter, Pageable pageable) {
		return cadTipoDeMetodoRepository.resumir(cadTipoDeMetodoFilter, pageable);
	}
	
	@Autowired
	private CadTipoDeMetodoService cadTipoDeMetodoService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADTIPODEMETODO') and #oauth2.hasScope('write')")
	public ResponseEntity<CadTipoDeMetodo> criar(@RequestBody CadTipoDeMetodo cadTipoDeMetodo, HttpServletResponse response) {
		CadTipoDeMetodo cadTipoDeMetodoSalva = cadTipoDeMetodoRepository.save(cadTipoDeMetodo);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, cadTipoDeMetodoSalva.getCdTipoDeMetodo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cadTipoDeMetodoSalva);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADTIPODEMETODO') and #oauth2.hasScope('read')")
	public ResponseEntity <CadTipoDeMetodo>buscarPeloCodigo(@PathVariable Long codigo) {
		CadTipoDeMetodo cadTipoDeMetodo = cadTipoDeMetodoRepository.findOne(codigo);
		return cadTipoDeMetodo != null ? ResponseEntity.ok(cadTipoDeMetodo) : ResponseEntity.notFound().build();
		
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_CADTIPODEMETODO') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		cadTipoDeMetodoRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADTIPODEMETODO') and #oauth2.hasScope('write')")
	public ResponseEntity<CadTipoDeMetodo> atualizar(@PathVariable Long codigo, @Valid @RequestBody CadTipoDeMetodo cadTipoDeMetodo) {
		CadTipoDeMetodo cadTipoDeMetodoSalva = cadTipoDeMetodoService.atualizar(codigo, cadTipoDeMetodo);
		return ResponseEntity.ok(cadTipoDeMetodoSalva);
	}
}
