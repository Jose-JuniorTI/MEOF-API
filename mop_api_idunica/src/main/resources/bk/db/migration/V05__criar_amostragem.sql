CREATE TABLE d06_amostragem_m(
	d06_cdamostragem BIGINT(20) AUTO_INCREMENT,
	d06_cdempresa BIGINT(20),
	d06_nmamostragem VARCHAR(200),

PRIMARY KEY (d06_cdamostragem, d06_cdempresa)
)Engine=InnoDB;

CREATE TABLE d08_frequencia_m(
	d08_cdfrequencia BIGINT(20) AUTO_INCREMENT,
	d08_cdempresa BIGINT(20),
	d08_nmfrequencia VARCHAR(200),

PRIMARY KEY (d08_cdfrequencia, d08_cdempresa)
)Engine=InnoDB;

CREATE TABLE d07_tipo_metodo_m(
	d07_cdtipometodo BIGINT(20) AUTO_INCREMENT,
	d07_cdempresa BIGINT(20),
	d07_nmtipometodo VARCHAR(200),

PRIMARY KEY (d07_cdtipometodo, d07_cdempresa)
)Engine=InnoDB;


INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Uma checagem nos mapas e/ou documentos');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Uma medição no campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Duas medições no campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Três medições no campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Quatro ou mais medições no campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Uma observação em campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Duas observações em campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Três observações em campo');
INSERT INTO d06_amostragem_m (d06_cdempresa, d06_nmamostragem) VALUES('1', 'Quatro ou mais observações em campo');

INSERT INTO d08_frequencia_m (d08_cdempresa, d08_nmfrequencia) VALUES('1', 'Uma vez por ano, na época da safra');
INSERT INTO d08_frequencia_m (d08_cdempresa, d08_nmfrequencia) VALUES('1', 'Duas vezes por ano, na época da safra');
INSERT INTO d08_frequencia_m (d08_cdempresa, d08_nmfrequencia) VALUES('1', 'Uma vez por ano, fora da época da safra');
INSERT INTO d08_frequencia_m (d08_cdempresa, d08_nmfrequencia) VALUES('1', 'Duas vezes por ano, fora da época da safra');
INSERT INTO d08_frequencia_m (d08_cdempresa, d08_nmfrequencia) VALUES('1', 'Mensalmente');
INSERT INTO d08_frequencia_m (d08_cdempresa, d08_nmfrequencia) VALUES('1', 'Trimestralmente');
INSERT INTO d08_frequencia_m (d08_cdempresa, d08_nmfrequencia) VALUES('1', 'Semestralmente');
INSERT INTO d08_frequencia_m (d08_cdempresa, d08_nmfrequencia) VALUES('1', 'Aleatória, por demanda ou exigência da legislação');

INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Análise de mapas e/ou documentação no campo');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Análise de mapas e/ou documentação no escritório');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Entrevistas com funcionários');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Medição em campo');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Medição no acampamento');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Observação em campo');
INSERT INTO d07_tipo_metodo_m (d07_cdempresa, d07_nmtipometodo) VALUES('1', 'Observação no acampamento');