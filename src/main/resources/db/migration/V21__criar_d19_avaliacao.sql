CREATE TABLE d19_avaliacao(
	d19_cdempresa BIGINT(20),
	d19_cdmonitoramento BIGINT(20),
	d19_cdavaliacao BIGINT(20),
	d19_nmavaliacao VARCHAR(200),
	d19_dtinicio DATETIME,
	d19_dtfim DATETIME,



PRIMARY KEY (d19_cdempresa,d19_cdmonitoramento,d19_cdavaliacao),
FOREIGN KEY(d19_cdmonitoramento,d19_cdempresa) REFERENCES d18_monitoramento(d18_cdmonitoramento,d18_cdempresa)

) Engine=InnoDB;

INSERT INTO d19_avaliacao(d19_cdempresa,d19_cdmonitoramento,d19_cdavaliacao,d19_nmavaliacao,d19_dtinicio,d19_dtfim) VALUES ('1','1','1','AVALIA플O INICIAL','2007-07-01 00:00:00.000','2007-08-31 00:00:00.000');
INSERT INTO d19_avaliacao(d19_cdempresa,d19_cdmonitoramento,d19_cdavaliacao,d19_nmavaliacao,d19_dtinicio,d19_dtfim) VALUES ('1','1','2','SEGUNDA AVALIA플O','2007-07-13 00:00:00.000','2007-08-31 00:00:00.000');
INSERT INTO d19_avaliacao(d19_cdempresa,d19_cdmonitoramento,d19_cdavaliacao,d19_nmavaliacao,d19_dtinicio,d19_dtfim) VALUES ('1','2','2','SEGUNDA AVALIA플O DA APLICA플O EXEMPLO','2007-07-01 00:00:00.000','2007-08-31 00:00:00.000');
INSERT INTO d19_avaliacao(d19_cdempresa,d19_cdmonitoramento,d19_cdavaliacao,d19_nmavaliacao,d19_dtinicio,d19_dtfim) VALUES ('1','2','3','TERCEIRA AVALIA플O APLICA플O EXEMPLO','2007-07-01 00:00:00.000','2007-08-31 00:00:00.000');
INSERT INTO d19_avaliacao(d19_cdempresa,d19_cdmonitoramento,d19_cdavaliacao,d19_nmavaliacao,d19_dtinicio,d19_dtfim) VALUES ('1','2','4','QUARTA AVALIA플O APLICA플O EXEMPLO','2007-07-01 00:00:00.000','2007-08-31 00:00:00.000');