package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.ModLocal2;
import br.embrapa.model.pk.ModLocal2_PK;
import br.embrapa.repository.ModLocal2Repository;


@Service
public class ModLocal2Service {

	@Autowired
	private ModLocal2Repository modLocal2Repository;
	
	
	public ModLocal2 atualizar(ModLocal2_PK codigo, ModLocal2 modLocal2) {
		
		ModLocal2 modLocal2Salva = buscarModLocal2PeloCodigo(codigo);
		BeanUtils.copyProperties(modLocal2, modLocal2Salva, "codigo");
		return modLocal2Repository.save(modLocal2Salva);
	}
	
	

	public ModLocal2 buscarModLocal2PeloCodigo(ModLocal2_PK codigo) {
		ModLocal2 modLocal2Salva = modLocal2Repository.findOne(codigo);
		if (modLocal2Salva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return modLocal2Salva;
}
	
}
