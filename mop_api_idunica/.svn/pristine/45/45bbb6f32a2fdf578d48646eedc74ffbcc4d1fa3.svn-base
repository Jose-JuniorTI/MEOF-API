package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.ModNivel4;
import br.embrapa.repository.ModNivel4Repository;

@Service
public class ModNivel4Service {

	@Autowired
	private ModNivel4Repository modNivel4Repository;

	public ModNivel4 atualizar(Long codigo, ModNivel4 modNivel4) {
		ModNivel4 modNivel4Salva = buscarModNivel4PeloCodigo(codigo);
		BeanUtils.copyProperties(modNivel4, modNivel4Salva, "codigo");
		return modNivel4Repository.save(modNivel4Salva);
	}
	
	

	public ModNivel4 buscarModNivel4PeloCodigo(Long codigo) {
		ModNivel4 modNivel4Salva = modNivel4Repository.findOne(codigo);
		if (modNivel4Salva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return modNivel4Salva;
}
	
}
