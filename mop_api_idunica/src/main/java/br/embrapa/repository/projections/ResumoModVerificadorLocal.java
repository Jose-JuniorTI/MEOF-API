package br.embrapa.repository.projections;

public class ResumoModVerificadorLocal {

	private String nmverificador;
	private String nmlocal1;
	private String nmlocal2;
	private String nmlocal3;
	private String txmetodologia;
	private String tipometodo;
	private String nmFrequencia;
	private String nmamostragem;
		
	
	public ResumoModVerificadorLocal(String nmverificador, String nmlocal1, String nmlocal2, String nmlocal3,
			String txmetodologia, String tipometodo, String nmFrequencia, String nmamostragem) {
		this.nmverificador = nmverificador;
		this.nmlocal1 = nmlocal1;
		this.nmlocal2 = nmlocal2;
		this.nmlocal3 = nmlocal3;
		this.txmetodologia = txmetodologia;
		this.tipometodo = tipometodo;
		this.nmFrequencia = nmFrequencia;
		this.nmamostragem = nmamostragem;
	}
	
	public String getNmverificador() {
		return nmverificador;
	}
	public void setNmverificador(String nmverificador) {
		this.nmverificador = nmverificador;
	}
	public String getNmlocal1() {
		return nmlocal1;
	}
	public void setNmlocal1(String nmlocal1) {
		this.nmlocal1 = nmlocal1;
	}
	public String getNmlocal2() {
		return nmlocal2;
	}
	public void setNmlocal2(String nmlocal2) {
		this.nmlocal2 = nmlocal2;
	}
	public String getNmlocal3() {
		return nmlocal3;
	}
	public void setNmlocal3(String nmlocal3) {
		this.nmlocal3 = nmlocal3;
	}
	public String getTxmetodologia() {
		return txmetodologia;
	}
	public void setTxmetodologia(String txmetodologia) {
		this.txmetodologia = txmetodologia;
	}
	public String getTipometodo() {
		return tipometodo;
	}
	public void setTipometodo(String tipometodo) {
		this.tipometodo = tipometodo;
	}
	public String getNmFrequencia() {
		return nmFrequencia;
	}
	public void setNmFrequencia(String nmFrequencia) {
		this.nmFrequencia = nmFrequencia;
	}
	public String getNmamostragem() {
		return nmamostragem;
	}
	public void setNmamostragem(String nmamostragem) {
		this.nmamostragem = nmamostragem;
	}
	
	
	
}
