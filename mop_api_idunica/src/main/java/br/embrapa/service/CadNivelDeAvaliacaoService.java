package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.CadNivelDeAvaliacao;
import br.embrapa.repository.CadNivelDeAvaliacaoRepository;

@Service
public class CadNivelDeAvaliacaoService {
	
	@Autowired
	private CadNivelDeAvaliacaoRepository cadNivelDeAvaliacaoRepository;
	
	
	public CadNivelDeAvaliacao atualizar(Long codigo, CadNivelDeAvaliacao cadNivelDeAvaliacao) {
		
		CadNivelDeAvaliacao cadNivelDeAvaliacaoSalva = buscarEmpresaPeloCodigo(codigo);
		BeanUtils.copyProperties(cadNivelDeAvaliacao, cadNivelDeAvaliacaoSalva, "codigo");
		return cadNivelDeAvaliacaoRepository.save(cadNivelDeAvaliacaoSalva);
	}
	
	

	public CadNivelDeAvaliacao buscarEmpresaPeloCodigo(Long codigo) {
		CadNivelDeAvaliacao cadNivelDeAvaliacaoSalva = cadNivelDeAvaliacaoRepository.findOne(codigo);
		if (cadNivelDeAvaliacaoSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return cadNivelDeAvaliacaoSalva;
	}

}
