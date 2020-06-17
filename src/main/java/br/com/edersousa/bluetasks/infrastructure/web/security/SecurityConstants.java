package br.com.edersousa.bluetasks.infrastructure.web.security;

public class SecurityConstants {

	public static final String SECRET_KEY = "tHeSeCrEtKey!";
	public static final String AUTHORIZATION_HEADER = "Authorization";
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final long EXPIRATION_TIME = 86400000; // = 1 dia
}
