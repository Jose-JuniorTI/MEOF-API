package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.ModMonitoramentoTemplate;
import br.embrapa.repository.ModMonitoramentoTemplateRepository;



@Service
public class ModMonitoramentoTemplateService {


	@Autowired
	private ModMonitoramentoTemplateRepository modMonitoramentoTemplateRepository;
	
	
	public ModMonitoramentoTemplate atualizar(Long codigo, ModMonitoramentoTemplate modMonitoramentoTemplate) {
		
		ModMonitoramentoTemplate modMonitoramentoTemplateSalva = buscarModMonitoramentoTemplatePeloCodigo(codigo);
		BeanUtils.copyProperties(modMonitoramentoTemplate, modMonitoramentoTemplateSalva, "codigo");
		return modMonitoramentoTemplateRepository.save(modMonitoramentoTemplateSalva);
	}
	
	

	public ModMonitoramentoTemplate buscarModMonitoramentoTemplatePeloCodigo(Long codigo) {
		ModMonitoramentoTemplate modMonitoramentoTemplateSalva = modMonitoramentoTemplateRepository.findOne(codigo);
		if (modMonitoramentoTemplateSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return modMonitoramentoTemplateSalva;
}
}
