package br.embrapa.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("mopapi")
public class MopApiProperty {
	private String originPermitida = "http://10.132.90.58:4200";
	private final Seguranca seguranca = new Seguranca();
	
	
	public Seguranca getSeguranca() {
		return seguranca;
	}
	

	public String getOriginPermitida() {
		return originPermitida;
	}

	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}


	public static class Seguranca {
		
		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
			
	}
	

}
