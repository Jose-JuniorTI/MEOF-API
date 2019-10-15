CREATE TABLE d03_local1_m(
	d03_cdlocal1 BIGINT(20) AUTO_INCREMENT,
	d03_cdempresa BIGINT(20),
	d03_nmlocal1 VARCHAR(200),

PRIMARY KEY(d03_cdlocal1,d03_cdempresa),
FOREIGN KEY(d03_cdempresa) REFERENCES d24_empresa(d24_cdempresa)
);

INSERT INTO d03_local1_m (d03_cdempresa, d03_cdlocal1, d03_nmlocal1 ) VALUES ('1','1', 'Floresta em operação de derruba');
INSERT INTO d03_local1_m (d03_cdempresa, d03_cdlocal1, d03_nmlocal1 ) VALUES ('1','2', 'Floresta em operação de arraste');
INSERT INTO d03_local1_m (d03_cdempresa, d03_cdlocal1, d03_nmlocal1 ) VALUES ('1','3', 'Pátio em operação');
INSERT INTO d03_local1_m (d03_cdempresa, d03_cdlocal1, d03_nmlocal1 ) VALUES ('1','4', 'Pátio transportado');
INSERT INTO d03_local1_m (d03_cdempresa, d03_cdlocal1, d03_nmlocal1 ) VALUES ('1','5', 'Infra-estrutura');
INSERT INTO d03_local1_m (d03_cdempresa, d03_cdlocal1, d03_nmlocal1 ) VALUES ('1','6', 'Monitoramento');
INSERT INTO d03_local1_m (d03_cdempresa, d03_cdlocal1, d03_nmlocal1 ) VALUES ('1','7', 'Acampamento');
INSERT INTO d03_local1_m (d03_cdempresa, d03_cdlocal1, d03_nmlocal1 ) VALUES ('1','8', 'Escritório (pré-campo)');
INSERT INTO d03_local1_m (d03_cdempresa, d03_cdlocal1, d03_nmlocal1 ) VALUES ('1','9', 'Entornos AMF');
INSERT INTO d03_local1_m (d03_cdempresa, d03_cdlocal1, d03_nmlocal1 ) VALUES ('1','10', '34324');