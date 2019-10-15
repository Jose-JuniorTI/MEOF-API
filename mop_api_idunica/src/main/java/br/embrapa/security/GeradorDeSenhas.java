package br.embrapa.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

	public class GeradorDeSenhas {
	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode("admin"));

	}
}
