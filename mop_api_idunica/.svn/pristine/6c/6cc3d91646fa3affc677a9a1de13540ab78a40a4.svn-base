package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.ModNivel1;
import br.embrapa.model.pk.ModNivel1_PK;
import br.embrapa.repository.ModNivel1Repository;



@Service
public class ModNivel1Service {

	@Autowired
	private ModNivel1Repository modNivel1Repository;
	
	/*public ModNivel1 findByKey(ModNivel1_PK pk) {
        
      return modNivel1Repository.buscarPorPK(pk.getCdNivel1(), pk.getCdEmpresa());
	}*/
	
	
	public ModNivel1 atualizar(ModNivel1_PK codigo, ModNivel1 modNivel1) {
		
		ModNivel1 modNivel1Salva = buscarModNivel1PeloCodigo(codigo);
		BeanUtils.copyProperties(modNivel1, modNivel1Salva, "codigo");
		return modNivel1Repository.save(modNivel1Salva);
	}
	
	

	public ModNivel1 buscarModNivel1PeloCodigo(ModNivel1_PK codigo) {
		ModNivel1 modNivel1Salva = modNivel1Repository.findOne(codigo);
		if (modNivel1Salva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return modNivel1Salva;
}
	
}
