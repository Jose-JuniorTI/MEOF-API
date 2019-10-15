CREATE TABLE d10_nivel1_m(
	d10_cdnivel1 BIGINT(20) AUTO_INCREMENT,
	d10_cdempresa BIGINT(20),
	d10_nmnivel1 VARCHAR(200),

PRIMARY KEY(d10_cdnivel1),
FOREIGN KEY(d10_cdempresa) REFERENCES d24_empresa(d24_cdempresa)
);

INSERT INTO d10_nivel1_m(d10_cdempresa, d10_nmnivel1) VALUES('1','-')