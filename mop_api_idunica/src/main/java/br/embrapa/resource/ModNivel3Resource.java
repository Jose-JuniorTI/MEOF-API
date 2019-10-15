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
import br.embrapa.model.CadEmpresa;
import br.embrapa.model.ModNivel3;
import br.embrapa.repository.ModNivel3Repository;
import br.embrapa.repository.filter.ModNivel3Filter;
import br.embrapa.service.ModNivel3Service;

@RestController
@RequestMapping("/modnivel3")
public class ModNivel3Resource {
	
	@Autowired
	private ModNivel3Repository modNivel3Repository;
	
	@Autowired
	private ModNivel3Service modNivel3Service;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModNivel3> criar(@RequestBody ModNivel3 ModNivel3, HttpServletResponse response) {
		ModNivel3 ModNivel3Salva = modNivel3Repository.save(ModNivel3);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, ModNivel3Salva.getCdNivel3()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ModNivel3Salva);
	}
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_MODLOCAL1') and #oauth2.hasScope('read')")
	public Page<ModNivel3> Pesquisar(ModNivel3Filter modNivel3Filter, Pageable pageable) {
		return modNivel3Repository.filtrar(modNivel3Filter, pageable);
	}
	
	
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_MODLOCAL2') and #oauth2.hasScope('read')")
	public ResponseEntity <ModNivel3>buscarPeloCodigo(@PathVariable Long codigo) {
		ModNivel3 modNivel3 = modNivel3Repository.findOne(codigo);
		return modNivel3 != null ? ResponseEntity.ok(modNivel3) : ResponseEntity.notFound().build();
		
	}	
			
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo, @PathVariable CadEmpresa cdEmpresa) {
		modNivel3Repository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModNivel3> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModNivel3 modNivel3) {
		ModNivel3 modNivel3Salva = modNivel3Service.atualizar(codigo, modNivel3);
		return ResponseEntity.ok(modNivel3Salva);
	}
}
