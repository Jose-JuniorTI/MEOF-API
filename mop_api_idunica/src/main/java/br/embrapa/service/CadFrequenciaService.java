package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.CadFrequencia;
import br.embrapa.repository.CadFrequenciaRepository;

@Service
public class CadFrequenciaService {

	@Autowired
	private CadFrequenciaRepository cadFrequenciaRepository;
	
	
	public CadFrequencia atualizar(Long codigo, CadFrequencia cadFrequencia) {
		
		CadFrequencia cadFrequenciaSalva = buscarFrequenciaPeloCodigo(codigo);
		BeanUtils.copyProperties(cadFrequencia, cadFrequenciaSalva, "codigo");
		return cadFrequenciaRepository.save(cadFrequenciaSalva);
	}
	
	

	public CadFrequencia buscarFrequenciaPeloCodigo(Long codigo) {
		CadFrequencia cadFrequenciaSalva = cadFrequenciaRepository.findOne(codigo);
		if (cadFrequenciaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return cadFrequenciaSalva;
	}
}
