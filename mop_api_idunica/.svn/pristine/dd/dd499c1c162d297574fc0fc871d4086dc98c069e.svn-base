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
import br.embrapa.model.CadMaterial;
import br.embrapa.repository.CadMaterialRepository;
import br.embrapa.repository.filter.CadMaterialFilter;
import br.embrapa.repository.projections.ResumoCadMaterial;
import br.embrapa.service.CadMaterialService;

@RestController
@RequestMapping("/cadmaterial")
public class CadMaterialResource {

	@Autowired
	private CadMaterialRepository cadMaterialRepository;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADMATERIAL') and #oauth2.hasScope('read')")
	public Page<CadMaterial> Pesquisar(CadMaterialFilter cadMaterialFilter, Pageable pageable) {
		return cadMaterialRepository.filtrar(cadMaterialFilter, pageable);
	}
	
	@GetMapping(params = "resumo")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADMATERIAL') and #oauth2.hasScope('read')")
	public Page<ResumoCadMaterial> resumir(CadMaterialFilter cadMaterialFilter, Pageable pageable) {
		return cadMaterialRepository.resumir(cadMaterialFilter, pageable);
	}
	
	@Autowired
	private CadMaterialService cadMaterialService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADMATERIAL') and #oauth2.hasScope('write')")
	public ResponseEntity<CadMaterial> criar(@RequestBody CadMaterial cadMaterial, HttpServletResponse response) {
		CadMaterial cadMaterialSalva = cadMaterialRepository.save(cadMaterial);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, cadMaterialSalva.getCdMaterial()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cadMaterialSalva);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADMATERIAL') and #oauth2.hasScope('read')")
	public ResponseEntity <CadMaterial>buscarPeloCodigo(@PathVariable Long codigo) {
		CadMaterial cadMaterial = cadMaterialRepository.findOne(codigo);
		return cadMaterial != null ? ResponseEntity.ok(cadMaterial) : ResponseEntity.notFound().build();
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@PreAuthorize("hasAuthority('ROLE_REMOVER_CADMATERIAL') and #oauth2.hasScope('write')")
	public void remover(@PathVariable Long codigo) {
		cadMaterialRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADMATERIAL') and #oauth2.hasScope('write')")
	public ResponseEntity<CadMaterial> atualizar(@PathVariable Long codigo, @Valid @RequestBody CadMaterial cadMaterial) {
		CadMaterial cadMaterialSalva = cadMaterialService.atualizar(codigo, cadMaterial);
		return ResponseEntity.ok(cadMaterialSalva);
	}
	
}
