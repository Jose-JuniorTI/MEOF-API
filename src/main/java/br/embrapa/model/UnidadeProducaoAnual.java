package br.embrapa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="d15_unidade_produção_anual")
public class UnidadeProducaoAnual {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "d15_cdupa")
	private long cdUpa;
	
	@ManyToOne
	@JoinColumn(name="d15_cdprojeto", referencedColumnName = "d14_cdprojeto")
	private AreaManejoFlorestal cdProjeto;
	
	@Column(name="d15_ano")
	private String ano;

}
