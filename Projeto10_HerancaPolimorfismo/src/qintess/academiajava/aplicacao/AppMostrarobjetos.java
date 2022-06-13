package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Automovel;
import qintess.academiajava.classes.Produto;

public class AppMostrarobjetos {
	public static void main(String[] args) {
		String curso = "Fundamentos do Java";
		System.out.println(curso);
		
		Automovel automovel = new Automovel("VW","Gol",2015, "1.5");
		System.out.println(automovel);
		
		Produto produto1 = new Produto("Monitor 21 pol.", "Informatica", 1500);
		Produto produto2 = new Produto("Panela De Aço Inox", "UD", 200);
		System.out.println(produto1);
		System.out.println(produto2);
		
	}

}
