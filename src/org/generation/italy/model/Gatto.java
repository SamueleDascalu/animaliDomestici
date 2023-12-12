package org.generation.italy.model;

public class Gatto extends AnimaleDomestico {
	boolean eteroCromiaOcchi;
	
	public Gatto(String nome, String razza, boolean eteroCromiaocchi) {
		super(nome, razza);
		this.eteroCromiaOcchi=eteroCromiaocchi;
	}
	
	public void faiFusa() {
		System.out.println("prprprprpr");
	}
	
	@Override
	public void faiVerso() {
		faiFusa();
	}
	
	@Override
	public void mangia() {
		System.out.println("mangio crochette al pesce");
	}
	
	@Override
	public String toString() {
		return super.toString()+"\neterocromia: "+eteroCromiaOcchi;
	}
}
