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
import br.embrapa.model.ModLocal3;
import br.embrapa.model.pk.ModLocal3_PK;
import br.embrapa.repository.ModLocal3Repository;
import br.embrapa.repository.filter.ModLocal3Filter;
import br.embrapa.repository.projections.ResumoModLocal3;
import br.embrapa.service.ModLocal3Service;


@RestController
@RequestMapping("/sublocaldeavaliacao")
public class ModLocal3Resource {
	
	@Autowired
	private ModLocal3Repository modLocal3Repository;
	
	
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_MODLOCAL3') and #oauth2.hasScope('read')")
	public Page<ModLocal3> Pesquisar(ModLocal3Filter modLocal3Filter, Pageable pageable) {
		return modLocal3Repository.filtrar(modLocal3Filter, pageable);
	}
	
	@GetMapping(params = "resumo")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_MODLOCAL2') and #oauth2.hasScope('read')")
	public Page<ResumoModLocal3> resumir(ModLocal3Filter modLocal3Filter, Pageable pageable) {
		return modLocal3Repository.resumir(modLocal3Filter, pageable);
	}
	

	
	@Autowired
	private ModLocal3Service modLocal3Service;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModLocal3> criar(@RequestBody ModLocal3 modLocal3, HttpServletResponse response) {
		ModLocal3 modLocal3Salva = modLocal3Repository.save(modLocal3);
		
	//	publisher.publishEvent(new RecursoCriadoEvent(this, response, modLocal3Salva.getCdLocal3()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(modLocal3Salva);
	}
	
	@GetMapping("/{codigo}")
	public ModLocal3 buscarPeloCodigo(@PathVariable ModLocal3_PK codigo) {
		return modLocal3Repository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable ModLocal3_PK codigo) {
		modLocal3Repository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModLocal3> atualizar(@PathVariable ModLocal3_PK codigo, @Valid @RequestBody ModLocal3 cadModLocal3) {
		ModLocal3 modLocal3Salva = modLocal3Service.atualizar(codigo, cadModLocal3);
		return ResponseEntity.ok(modLocal3Salva);
}


}
