package br.embrapa.resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.embrapa.model.CadNivelDeAvaliacao;
import br.embrapa.repository.CadNivelDeAvaliacaoRepository;
import br.embrapa.repository.filter.CadNivelDeAvaliacaoFilter;
import br.embrapa.service.CadNivelDeAvaliacaoService;

@RestController
@RequestMapping("/cadniveldeavaliacao")
public class CadNivelDeAvaliacaoResource {
	
	@Autowired
	private CadNivelDeAvaliacaoRepository cadNivelDeAvaliacaoRepository;
	
	@Autowired
	private CadNivelDeAvaliacaoService cadNivelDeAvaliacaoService;
	
		
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADNIVELDEAVALIACAO') and #oauth2.hasScope('read')")
	public Page<CadNivelDeAvaliacao> Pesquisar(CadNivelDeAvaliacaoFilter cadNivelDeAvaliacaoFilter, Pageable pageable) {
		return cadNivelDeAvaliacaoRepository.filtrar(cadNivelDeAvaliacaoFilter, pageable);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADNIVELDEAVALIACAO') and #oauth2.hasScope('read')")
	public ResponseEntity <CadNivelDeAvaliacao>buscarPeloCodigo(@PathVariable Long codigo) {
		CadNivelDeAvaliacao cadNivelDeAvaliacao = cadNivelDeAvaliacaoRepository.findOne(codigo);
		return cadNivelDeAvaliacao != null ? ResponseEntity.ok(cadNivelDeAvaliacao) : ResponseEntity.notFound().build();
		
	}
	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_EMPRESA') and #oauth2.hasScope('write')")
	public ResponseEntity<CadNivelDeAvaliacao> atualizar(@PathVariable Long codigo, @Valid @RequestBody CadNivelDeAvaliacao cadNivelDeAvaliacao) {
		CadNivelDeAvaliacao cadNivelDeAvaliacaoSalva = cadNivelDeAvaliacaoService.atualizar(codigo, cadNivelDeAvaliacao);
		return ResponseEntity.ok(cadNivelDeAvaliacaoSalva);
	}
	
	
}
