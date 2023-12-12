package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

import org.generation.italy.model.AnimaleDomestico;
import org.generation.italy.model.Cane;
import org.generation.italy.model.Gatto;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String animaleScelto, nome, razza;
		
		HashMap<String, AnimaleDomestico> animali = new HashMap<String, AnimaleDomestico>();
		
		do {
			System.out.println("Inserisci il tipo di animale da aggiungere (cane/gatto) ");
			animaleScelto=scanner.nextLine();
			
			System.out.println("Inserisci il nome: ");
			nome=scanner.nextLine();
			
			System.out.println("Inserisci la razza: ");
			razza=scanner.nextLine();
			
			switch(animaleScelto) {
			case "cane":
				boolean museruolaObbligatoria=false;
				
				System.out.println("La museruola é obbligatoria? (si/no) ");
				if(scanner.nextLine().equals("si")) {
					museruolaObbligatoria=true;
				}
				Cane cane = new Cane(nome, razza, museruolaObbligatoria);
				animali.put(nome, cane);
				cane.faiVerso();
				System.out.println("sono stato aggiunto!");
				break;
			case "gatto":
				boolean eteroCromiaOcchi=false;
				
				System.out.println("Ha gli occhi eterocromi? (si/no) ");
				if(scanner.nextLine().equals("si")) {
					eteroCromiaOcchi=true;
				}
				Gatto gatto = new Gatto(nome, razza, eteroCromiaOcchi);
				animali.put(nome, gatto);
				gatto.faiVerso();
				System.out.println("sono stato aggiunto!");
				break;
			default:
				System.out.println("Animale inesistente!");
			}
			for(AnimaleDomestico animale:animali.values()) {
				System.out.println(animale.toString());
			}
			System.out.println("Vuoi continuare? (si/no) ");
		}while(scanner.nextLine().equals("si"));
		
		System.out.println("Inserisci il nome di un animale: ");
		nome=scanner.nextLine();
		
		String cibo;
		
		if(animali.containsKey(nome)) {
			AnimaleDomestico animale = animali.get(nome);
			if(animale instanceof Cane) {
				System.out.println("Sono un cane.");
				System.out.println(((Cane)animale).toString());
				((Cane)animale).faiVerso();
				((Cane)animale).mangia();
				System.out.println("Vuoi dargli altro da mangiare? (si/no) ");
				if(scanner.nextLine().equals("si")) {
					System.out.println("Inserisci il cibo che vuoi fargli mangiare: ");
					cibo = scanner.nextLine();
					((Cane)animale).mangia(cibo);
				}
			} else if(animale instanceof Gatto) {
				System.out.println("Sono un gatto.");
				System.out.println(((Gatto)animale).toString());
				((Gatto)animale).faiVerso();
				((Gatto)animale).mangia();
				
				System.out.println("Vuoi dargli altro da mangiare? (si/no) ");
				if(scanner.nextLine().equals("si")) {
					System.out.println("Inserisci il cibo che vuoi fargli mangiare: ");
					cibo = scanner.nextLine();
					((Gatto)animale).mangia(cibo);
				}
			}
		} else {
			System.out.println("L'animale non é presente all'interno della lista.");
		}
		
		System.out.println("The end");
		
		scanner.close();
	}

}
