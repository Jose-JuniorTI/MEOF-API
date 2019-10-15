package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.ModLocal3;
import br.embrapa.model.pk.ModLocal3_PK;
import br.embrapa.repository.ModLocal3Repository;



@Service
public class ModLocal3Service {

	@Autowired
	private ModLocal3Repository modLocal3Repository;
	
	
	public ModLocal3 atualizar(ModLocal3_PK codigo, ModLocal3 modLocal3) {
		
		ModLocal3 modLocal3Salva = buscarModLocal3PeloCodigo(codigo);
		BeanUtils.copyProperties(modLocal3, modLocal3Salva, "codigo");
		return modLocal3Repository.save(modLocal3Salva);
	}
	
	

	public ModLocal3 buscarModLocal3PeloCodigo(ModLocal3_PK codigo) {
		ModLocal3 modLocal3Salva = modLocal3Repository.findOne(codigo);
		if (modLocal3Salva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return modLocal3Salva;
}
	
	
}
