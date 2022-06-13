package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Automovel;

public class AppCodigoHash {
	public static void main(String[] args) {
		System.out.println("Java".hashCode());
		System.out.println("java".hashCode());
		System.out.println("A".hashCode());
		System.out.println("a".hashCode());
		System.out.println("--------------------------------");
		
		Automovel automovel1 = new Automovel("VW","Gol",2015, "1.5");
		Automovel automovel2 = new Automovel("VW","Gol",2015, "1.5");
		
		System.out.println(automovel1.hashCode());
		System.out.println(automovel2.hashCode());
		

}
}