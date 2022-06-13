package qintess.academiajava.aplicacao;

import qintess.academiajava.utils.Utilitarios;

public class AppUtilitarios {
	public static void main(String[] args) {
		//metodo somar
		double soma = Utilitarios.somar(3, 8);
		System.out.println("soma:" + soma);
		
		//dolar para real
		double dolares = 24.50;
		double reais = Utilitarios.dolarParaReal(dolares);
		System.out.println(dolares + "dolares equivalem a " + reais  + " reais");
	}

}
