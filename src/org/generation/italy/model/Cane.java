package org.generation.italy.model;

public class Cane extends AnimaleDomestico {
	boolean museruolaObbligatoria;
	
	public Cane(String nome, String razza, boolean museruolaObbligatoria) {
		super(nome, razza);
		this.museruolaObbligatoria=museruolaObbligatoria;
	}
	
	@Override
	public void faiVerso() {
		System.out.println("bau bau");
	}
	
	@Override
	public void mangia() {
		System.out.println("mangio crochette alla carne");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nMuseruola: "+museruolaObbligatoria;
	}
}
