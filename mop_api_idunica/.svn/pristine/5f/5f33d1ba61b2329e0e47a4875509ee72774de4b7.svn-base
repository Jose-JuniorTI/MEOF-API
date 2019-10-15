package br.embrapa.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.embrapa.model.Verificador_m;
import br.embrapa.model.pk.Verificador_m_PK;
import br.embrapa.repository.Verificador_mRepository;

@Service
public class Verificador_mService {

	@Autowired
	private Verificador_mRepository verificador_mRepository;
	
	public Verificador_m atualizar(Verificador_m_PK codigo, Verificador_m verificador_m) {
		
		Verificador_m verificador_mSalva = buscarVerificadorPeloCodigo(codigo);
		BeanUtils.copyProperties(verificador_m, verificador_mSalva, "codigo");
		return verificador_mRepository.save(verificador_mSalva);
	}
	

	public Verificador_m buscarVerificadorPeloCodigo(Verificador_m_PK codigo) {
		Verificador_m verificador_mSalva = verificador_mRepository.findOne(codigo);
		if (verificador_mSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return verificador_mSalva;
	}

}
