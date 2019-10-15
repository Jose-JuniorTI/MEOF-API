package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.ModNivel3;
import br.embrapa.repository.ModNivel3Repository;

@Service
public class ModNivel3Service {

	@Autowired
	private ModNivel3Repository modNivel3Repository;
	
	public ModNivel3 atualizar(Long codigo, ModNivel3 modNivel3) {
		
		ModNivel3 modNivel3Salva = buscarModNivel3PeloCodigo(codigo);
		BeanUtils.copyProperties(modNivel3, modNivel3Salva, "codigo");
		return modNivel3Repository.save(modNivel3Salva);
	}
	
	

	public ModNivel3 buscarModNivel3PeloCodigo(Long codigo) {
		ModNivel3 modNivel3Salva = modNivel3Repository.findOne(codigo);
		if (modNivel3Salva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return modNivel3Salva;
}
	
}
