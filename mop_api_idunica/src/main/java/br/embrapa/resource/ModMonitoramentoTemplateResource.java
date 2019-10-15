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
import br.embrapa.model.ModMonitoramentoTemplate;
import br.embrapa.repository.ModMonitoramentoTemplateRepository;
import br.embrapa.repository.filter.ModMonitoramentoTemplateFilter;
import br.embrapa.repository.projections.ResumoModMonitoramentoTemplate;
import br.embrapa.service.ModMonitoramentoTemplateService;



@RestController
@RequestMapping("/modmonitoramentotemplate")
public class ModMonitoramentoTemplateResource {
	
	@Autowired
	private ModMonitoramentoTemplateRepository modMonitoramentoTemplateRepository;
	
	
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_MODLOCAL1') and #oauth2.hasScope('read')")
	public Page<ModMonitoramentoTemplate> Pesquisar(ModMonitoramentoTemplateFilter modMonitoramentoTemplateFilter, Pageable pageable) {
		return modMonitoramentoTemplateRepository.filtrar(modMonitoramentoTemplateFilter, pageable);
	}
	
	@GetMapping(params = "resumo")
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_MODLOCAL1') and #oauth2.hasScope('read')")
	public Page<ResumoModMonitoramentoTemplate> resumir(ModMonitoramentoTemplateFilter modMonitoramentoTemplateFilter, Pageable pageable) {
		return modMonitoramentoTemplateRepository.resumir(modMonitoramentoTemplateFilter, pageable);
	}
	

	
	@Autowired
	private ModMonitoramentoTemplateService modMonitoramentoTemplateService;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping
	public ResponseEntity<ModMonitoramentoTemplate> criar(@RequestBody ModMonitoramentoTemplate modMonitoramentoTemplate, HttpServletResponse response) {
		ModMonitoramentoTemplate modMonitoramentoTemplateSalva = modMonitoramentoTemplateRepository.save(modMonitoramentoTemplate);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, modMonitoramentoTemplateSalva.getCdTemplate()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(modMonitoramentoTemplateSalva);
	}
	
	@GetMapping("/{codigo}")
	public ModMonitoramentoTemplate buscarPeloCodigo(@PathVariable Long codigo) {
		return modMonitoramentoTemplateRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		modMonitoramentoTemplateRepository.delete(codigo);
	}
	
	@PutMapping("/{codigo}")
	public ResponseEntity<ModMonitoramentoTemplate> atualizar(@PathVariable Long codigo, @Valid @RequestBody ModMonitoramentoTemplate modMonitoramentoTemplate) {
		ModMonitoramentoTemplate ModMonitoramentoTemplateSalva = modMonitoramentoTemplateService.atualizar(codigo, modMonitoramentoTemplate);
		return ResponseEntity.ok(ModMonitoramentoTemplateSalva);
}


}
