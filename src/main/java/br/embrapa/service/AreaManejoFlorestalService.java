package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.AreaManejoFlorestal;
import br.embrapa.repository.AreaManejoFlorestalRepository;

@Service
public class AreaManejoFlorestalService {

	@Autowired
	private AreaManejoFlorestalRepository areaManejoFlorestalRepository;
	
	
	public AreaManejoFlorestal atualizar(Long codigo, AreaManejoFlorestal areaManejoFlorestal) {
		
		AreaManejoFlorestal areaManejoFlorestalSalva = buscarEmpresaPeloCodigo(codigo);
		BeanUtils.copyProperties(areaManejoFlorestal, areaManejoFlorestalSalva, "codigo");
		return areaManejoFlorestalRepository.save(areaManejoFlorestalSalva);
	}
	
	

	public AreaManejoFlorestal buscarEmpresaPeloCodigo(Long codigo) {
		AreaManejoFlorestal areaManejoFlorestalSalva = areaManejoFlorestalRepository.findOne(codigo);
		if (areaManejoFlorestalSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return areaManejoFlorestalSalva;
	}
	
}
