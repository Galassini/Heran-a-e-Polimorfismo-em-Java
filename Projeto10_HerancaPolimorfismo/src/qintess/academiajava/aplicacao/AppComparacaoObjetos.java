package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Automovel;
import qintess.academiajava.classes.Produto;

public class AppComparacaoObjetos {
	public static void main(String[] args) {
		//Comparando objetos String
		String s1 = "Java";
		String s2 = "Java";
		System.out.println("s1 == S2 ? " + (s1 == s2));
		System.out.println("s1.equals(s2) ? " + s1.equals(s2));
		
		String s3 = new String("Java");
		String s4 = new String("Java");
		System.out.println("s3 == S4 ? " + (s3 == s4));
		System.out.println("s3.equals(s4) ? " + s3.equals(s4));
		System.out.println("--------------------------------");
		/*
		 * Vamos comparar dois objetos da classes  Automovel
		 */
		Automovel auto1 = new Automovel("VW", "Passat", 2020, "2.0");
		Automovel auto2 = new Automovel("VW", "Passat", 2020, "2.0");
		System.out.println("auto1 == auto2 ? " +(auto1 == auto2));
		System.out.println("auto1.equals(auto2) ? " + auto1.equals(auto2));
		System.out.println("--------------------------------");
		
		/*
		 * Vamos comparar  dois objetos da classe Produto
		 */
		
		Produto prod1 = new Produto("Mochila", "Acessorio", 300);
		Produto prod2 = new Produto("Mochila", "Acessorio", 300);
		System.out.println("prod1.equals(prod2) ? " + prod1.equals(prod2));
	}

}
 