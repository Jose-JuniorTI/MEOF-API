package br.embrapa.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.embrapa.model.Verificador_m;
import br.embrapa.model.pk.Verificador_m_PK;
import br.embrapa.repository.Verificador_mRepository;
import br.embrapa.repository.filter.Verificador_mFilter;
import br.embrapa.repository.projections.ResumoVerificador_m;
import br.embrapa.service.Verificador_mService;

@RestController
@RequestMapping("/verificador_m")
public class Verificador_mResource {

	@Autowired
	private Verificador_mRepository verificador_mRepository;
	
	@Autowired
	private Verificador_mService verificador_mService;
	
	
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_VERIFICADOR_M') and #oauth2.hasScope('read')")
	public List<Verificador_m> Pesquisar(Verificador_mFilter verificador_mFilter) {
		return verificador_mRepository.filtrar(verificador_mFilter);
	}
	
	@GetMapping(params = "resumo")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_VERIFICADOR_M') and #oauth2.hasScope('read')")
	public List<ResumoVerificador_m> resumir(Verificador_mFilter verificador_mFilter) {
		return verificador_mRepository.resumir(verificador_mFilter);
	}
	
	@GetMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_VERIFICADOR_M') and #oauth2.hasScope('read')")
	public ResponseEntity <Verificador_m>buscarPeloCodigo(@PathVariable Verificador_m_PK codigo) {
		Verificador_m verificador_m = verificador_mRepository.findOne(codigo);
		return verificador_m != null ? ResponseEntity.ok(verificador_m) : ResponseEntity.notFound().build();
		
	}
	

	
	@PutMapping("/{codigo}")
	@PreAuthorize("hasAuthority('ROLE_CADASTRAR_VERIFICADOR_M') and #oauth2.hasScope('write')")
	public ResponseEntity<Verificador_m> atualizar(@PathVariable Verificador_m_PK codigo, @Valid @RequestBody Verificador_m verificador_m) {
		Verificador_m verificador_mSalva = verificador_mService.atualizar(codigo, verificador_m);
		return ResponseEntity.ok(verificador_mSalva);
	}
	
}
