package br.com.alura.ecommerce;

public class CorrelationId {

	private final String id;
	
	public CorrelationId() {
		id = UUID.randomUUID().toString();
	}
}
