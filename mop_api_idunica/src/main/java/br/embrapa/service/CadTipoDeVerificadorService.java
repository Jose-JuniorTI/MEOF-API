package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.CadTipoDeVerificador;
import br.embrapa.repository.CadTipoDeVerificadorRepository;

@Service
public class CadTipoDeVerificadorService {

	@Autowired
	private CadTipoDeVerificadorRepository cadTipoDeVerificadorRepository;
	
	
	public CadTipoDeVerificador atualizar(Long codigo, CadTipoDeVerificador cadTipoDeVerificador) {
		
		CadTipoDeVerificador cadTipoDeVerificadorSalva = buscarTipoDeVerificadorPeloCodigo(codigo);
		BeanUtils.copyProperties(cadTipoDeVerificador, cadTipoDeVerificadorSalva, "cdTipoVerificador");
		return cadTipoDeVerificadorRepository.save(cadTipoDeVerificadorSalva);
	}
	
	

	public CadTipoDeVerificador buscarTipoDeVerificadorPeloCodigo(Long codigo) {
		CadTipoDeVerificador cadTipoDeVerificadorSalva = cadTipoDeVerificadorRepository.findOne(codigo);
		if (cadTipoDeVerificadorSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return cadTipoDeVerificadorSalva;
	}
}
