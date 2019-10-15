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
import br.embrapa.model.CadTipoDeVerificador;
import br.embrapa.repository.CadTipoDeVerificadorRepository;
import br.embrapa.repository.filter.CadTipoDeVerificadorFilter;
import br.embrapa.service.CadTipoDeVerificadorService;


@RestController
@RequestMapping("/cadtipodeverificador")
public class CadTipoDeVerificadorResource {

	

	@Autowired
	private CadTipoDeVerificadorRepository cadTipoDeVerificadorRepository;
	
	
	/*@GetMapping
	public List<CadTipoDeVerificador> listar(CadTipoDeVerificadorFilter cadTipoDeVerificadorFilter, Pageable pageable){
		return cadTipoDeVerificadorRepository.findAll(sortByIdAsc());
	}
	
	 private Sort sortByIdAsc() {
	        return new Sort(Sort.Direction.ASC, "cdTipoDeVerificador");
	}*/
	
	@GetMapping
	public Page<CadTipoDeVerificador> Pesquisar(CadTipoDeVerificadorFilter cadTipoDeVerificadorFilter, Pageable pageable) {
		
		return cadTipoDeVerificadorRepository.filtrar(cadTipoDeVerificadorFilter, pageable);
	}
	
	@Autowired
	private CadTipoDeVerificadorService cadTipoDeVerificadorService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADFREQUENCIA') and #oauth2.hasScope('write')")
	public ResponseEntity<CadTipoDeVerificador> criar(@RequestBody CadTipoDeVerificador cadTipoDeVerificador, HttpServletResponse response) {
		CadTipoDeVerificador cadTipoDeVerificadorSalva = cadTipoDeVerificadorRepository.save(cadTipoDeVerificador);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, cadTipoDeVerificadorSalva.getCdTipoDeVerificador()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cadTipoDeVerificadorSalva);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADFREQUENCIA') and #oauth2.hasScope('read')")
	public ResponseEntity <CadTipoDeVerificador>buscarPeloCodigo(@PathVariable Long codigo) {
		CadTipoDeVerificador cadTipoDeVerificador = cadTipoDeVerificadorRepository.findOne(codigo);
		return cadTipoDeVerificador != null ? ResponseEntity.ok(cadTipoDeVerificador) : ResponseEntity.notFound().build();
		
	}
	
	@DeleteMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_REMOVER_CADFREQUENCIA') and #oauth2.hasScope('write')")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		cadTipoDeVerificadorRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_CADFREQUENCIA') and #oauth2.hasScope('write')")
	public ResponseEntity<CadTipoDeVerificador> atualizar(@PathVariable Long codigo, @Valid @RequestBody CadTipoDeVerificador cadTipoDeVerificador) {
		CadTipoDeVerificador cadTipoDeVerificadorSalva = cadTipoDeVerificadorService.atualizar(codigo, cadTipoDeVerificador);
		
		
		return ResponseEntity.ok(cadTipoDeVerificadorSalva);
	}
	
}
