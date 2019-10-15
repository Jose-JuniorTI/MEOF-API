package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.CadTipoDeMetodo;
import br.embrapa.repository.CadTipoDeMetodoRepository;

@Service
public class CadTipoDeMetodoService {
	
	@Autowired
	private CadTipoDeMetodoRepository cadTipoDeMetodoRepository;
	
	
	public CadTipoDeMetodo atualizar(Long codigo, CadTipoDeMetodo cadTipoDeMetodo) {
		
		CadTipoDeMetodo cadTipoDeMetodoSalva = buscarTipoDeMetodoPeloCodigo(codigo);
		BeanUtils.copyProperties(cadTipoDeMetodo, cadTipoDeMetodoSalva, "codigo");
		return cadTipoDeMetodoRepository.save(cadTipoDeMetodoSalva);
	}
	
	

	public CadTipoDeMetodo buscarTipoDeMetodoPeloCodigo(Long codigo) {
		CadTipoDeMetodo cadTipoDeMetodoSalva = cadTipoDeMetodoRepository.findOne(codigo);
		if (cadTipoDeMetodoSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return cadTipoDeMetodoSalva;
	}

}
