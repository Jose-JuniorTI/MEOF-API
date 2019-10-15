CREATE TABLE d04_local2_m(
	d04_cdempresa BIGINT(20) REFERENCES d03_local1_m(d03_cdempresa), 
	d04_cdlocal1 BIGINT(20) REFERENCES d03_local1_m(d03_cdlocal1),
	d04_cdlocal2 BIGINT(20),
	d04_nmlocal2 VARCHAR(200),

PRIMARY KEY(d04_cdempresa,d04_cdlocal1,d04_cdlocal2),
KEY `fk_d03_cdempresa_d03_local1_m_idx` (`d04_cdempresa`),
KEY `fk_d03_cdlocal1_d03_local1_m_idx` (`d04_cdlocal1`)
) Engine=InnoDB;

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 1, 0, '-');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 1, 1, 'Picadas do invent�rio');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 1, 2, 'Derruba');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 2, 0, '-');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 2, 1, 'Trilhas de arraste');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 3, 0, '-');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 3, 1, 'Todo o p�tio');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 3, 2, 'Bordas do p�tio');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 3, 3, 'Sa�da do p�tio');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 4, 0, '-');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 4, 1, 'Todo o p�tio');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 5, 0, '-');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 5, 1, 'Estradas principais e de acesso');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 5, 2, 'Estradas secund�rias');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 5, 3, 'Toda malha vi�ria');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 6, 0, '-');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 6, 1, 'Parcela');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 6, 2, 'Geral');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 7, 0, '-');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 7, 1, 'Geral');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 7, 2, 'Alojamento');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 8, 0, '-');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 8, 1, 'Geral');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 8, 2, 'PMFS/POA');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 9, 0, '-');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 9, 1, 'Geral');

INSERT INTO d04_local2_m (d04_cdempresa, d04_cdlocal1, d04_cdlocal2, d04_nmlocal2) VALUES(1, 9, 2, 'Especififififif');