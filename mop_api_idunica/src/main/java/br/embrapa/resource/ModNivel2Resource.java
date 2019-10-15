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
import br.embrapa.model.ModNivel2;
import br.embrapa.repository.ModNivel2Repository;
import br.embrapa.repository.filter.ModNivel2Filter;
import br.embrapa.service.ModNivel2Service;

@RestController
@RequestMapping("/modnivel2")
public class ModNivel2Resource {
	
	@Autowired
	private ModNivel2Repository modNivel2Repository;
	
	@Autowired
	private ModNivel2Service modNivel2Service;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModNivel2> criar(@RequestBody ModNivel2 ModNivel2, HttpServletResponse response) {
		ModNivel2 ModNivel2Salva = modNivel2Repository.save(ModNivel2);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, ModNivel2Salva.getCdNivel2()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ModNivel2Salva);
	}
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_MODLOCAL1') and #oauth2.hasScope('read')")
	public Page<ModNivel2> Pesquisar(ModNivel2Filter modNivel2Filter, Pageable pageable) {
		return modNivel2Repository.filtrar(modNivel2Filter, pageable);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_MODLOCAL2') and #oauth2.hasScope('read')")
	public ResponseEntity <ModNivel2>buscarPeloCodigo(@PathVariable Long codigo) {
		ModNivel2 modNivel2 = modNivel2Repository.findOne(codigo);
		return modNivel2 != null ? ResponseEntity.ok(modNivel2) : ResponseEntity.notFound().build();
		
	}	
			
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo, @PathVariable CadEmpresa cdEmpresa) {
		modNivel2Repository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModNivel2> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModNivel2 modNivel2) {
		ModNivel2 modNivel2Salva = modNivel2Service.atualizar(codigo, modNivel2);
		return ResponseEntity.ok(modNivel2Salva);
	}
}
