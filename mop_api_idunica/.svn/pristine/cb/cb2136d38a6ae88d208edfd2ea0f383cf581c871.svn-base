package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.CadAmostragem;
import br.embrapa.repository.CadAmostragemRepository;

@Service
public class CadAmostragemService {

	@Autowired
	private CadAmostragemRepository cadAmostragemRepository;
	
	
	public CadAmostragem atualizar(Long codigo, CadAmostragem cadAmostragem) {
		
		CadAmostragem cadAmostragemSalva = buscarAmostragemPeloCodigo(codigo);
		BeanUtils.copyProperties(cadAmostragem, cadAmostragemSalva, "codigo");
		return cadAmostragemRepository.save(cadAmostragemSalva);
	}
	
	

	public CadAmostragem buscarAmostragemPeloCodigo(Long codigo) {
		CadAmostragem cadAmostragemSalva = cadAmostragemRepository.findOne(codigo);
		if (cadAmostragemSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return cadAmostragemSalva;
	}
}
