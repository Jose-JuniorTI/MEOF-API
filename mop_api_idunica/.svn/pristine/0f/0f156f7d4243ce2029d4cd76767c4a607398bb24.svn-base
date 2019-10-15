package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.ModNivel2;
import br.embrapa.repository.ModNivel2Repository;

@Service
public class ModNivel2Service {

	@Autowired
	private ModNivel2Repository modNivel2Repository;
	
	public ModNivel2 atualizar(Long codigo, ModNivel2 modNivel2) {
			
			ModNivel2 modNivel2Salva = buscarModNivel2PeloCodigo(codigo);
			BeanUtils.copyProperties(modNivel2, modNivel2Salva, "codigo");
			return modNivel2Repository.save(modNivel2Salva);
		}
		
	

	public ModNivel2 buscarModNivel2PeloCodigo(Long codigo) {
		ModNivel2 modNivel2Salva = modNivel2Repository.findOne(codigo);
			if (modNivel2Salva == null) {
				throw new EmptyResultDataAccessException(1);
			}
			return modNivel2Salva;
	}
}
