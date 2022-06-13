package qintess.academiajava.aplicacao;

import qintess.academiajava.classes.Produto;

public class AppProduto {
	public static void main(String[] args) {
		Produto p1 = new Produto("Bicicleta", "Transporte", 1000);
		Produto p2 = new Produto("Mochila", "Acessorios", 200);
		Produto p3 = new Produto("Hamburguer", "Alimentação", 20);

		System.out.println(p1.mostrar());
		System.out.println("----------");
		System.out.println(p2.mostrar());
		System.out.println("----------");
		System.out.println(p3.mostrar());

	}

}
