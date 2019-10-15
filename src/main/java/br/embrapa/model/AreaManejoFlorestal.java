package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="d14_areaManejoFlorestal")
	
public class AreaManejoFlorestal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="cdEmpresa")
	private long cd_Empresa;
	
}
