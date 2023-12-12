package org.generation.italy.model;

public class AnimaleDomestico {
	protected String nome, razza;
	
	public AnimaleDomestico(String nome, String razza) {
		super();
		this.nome=nome;
		this.razza=razza;
	}
	
	public void faiVerso() {
		System.out.println("emetto un verso");
	}
	
	public void mangia() {
		System.out.println("mangio del cibo");
	}
	
	public void mangia(String cibo) {
		System.out.println("mangio "+cibo);
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+"\nRazza: "+razza;
	}
}
