CREATE TABLE p21_coleta (
	p21_cdempresa BIGINT(20) REFERENCES  p01_verificador_m(p01_cdempresa),
	p21_cdverificador BIGINT(20) REFERENCES  p01_verificador_m(p01_cdverificador),
	p21_cdtipoverificador BIGINT(20) REFERENCES  p01_verificador_m(p01_cdtipoverificador),
	p21_cdmonitoramento BIGINT(20),
	p21_cdavaliacao BIGINT(20),
	p21_nrobservacoes BIGINT(20),
	p21_nrnaoconf BIGINT(20),

PRIMARY KEY(p21_cdempresa,p21_cdverificador,p21_cdtipoverificador,p21_cdmonitoramento,p21_cdavaliacao),
	
FOREIGN KEY(p21_cdempresa, p21_cdmonitoramento, p21_cdavaliacao) REFERENCES d19_avaliacao(d19_cdempresa, d19_cdmonitoramento, d19_cdavaliacao),
INDEX `r15_verificador_local_m_ibfk_5`(`p21_cdempresa`) 

) Engine=InnoDB;