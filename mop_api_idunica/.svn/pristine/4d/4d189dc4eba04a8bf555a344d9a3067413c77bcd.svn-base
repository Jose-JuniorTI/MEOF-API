package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.CadMaterial;
import br.embrapa.repository.CadMaterialRepository;

@Service
public class CadMaterialService {

	@Autowired
	private CadMaterialRepository cadMaterialRepository;
	
	
	public CadMaterial atualizar(Long codigo, CadMaterial cadMaterial) {
		
		CadMaterial cadMaterialSalva = buscarMaterialPeloCodigo(codigo);
		BeanUtils.copyProperties(cadMaterial, cadMaterialSalva, "codigo");
		return cadMaterialRepository.save(cadMaterialSalva);
	}
	
	

	public CadMaterial buscarMaterialPeloCodigo(Long codigo) {
		CadMaterial cadMaterialSalva = cadMaterialRepository.findOne(codigo);
		if (cadMaterialSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return cadMaterialSalva;
	}
	
}
