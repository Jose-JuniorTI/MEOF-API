package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.ModLocal1;
import br.embrapa.model.pk.ModLocal1_PK;
import br.embrapa.repository.ModLocal1Repository;

@Service
public class ModLocal1Service {

	@Autowired
	private ModLocal1Repository modLocal1Repository;
	
	/*public ModLocal1 findByKey(ModLocal1_PK pk) {
        
      return modLocal1Repository.buscarPorPK(pk.getCdLocal1(), pk.getCdEmpresa());
	}*/
	
	
	public ModLocal1 atualizar(ModLocal1_PK codigo, ModLocal1 modLocal1) {
		
		ModLocal1 modLocal1Salva = buscarModLocal1PeloCodigo(codigo);
		BeanUtils.copyProperties(modLocal1, modLocal1Salva, "codigo");
		return modLocal1Repository.save(modLocal1Salva);
	}
	
	

	public ModLocal1 buscarModLocal1PeloCodigo(ModLocal1_PK codigo) {
		ModLocal1 modLocal1Salva = modLocal1Repository.findOne(codigo);
		if (modLocal1Salva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return modLocal1Salva;
}
	
}
