package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.enumeracoes.Sexo;

public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(
				"Julio Pereira", //NOME
				33, //IDADE
				Sexo.MASCULINO, //SEXO
				"Motoboy", //CARGO
				3000 //SALÁRIO
				);
		
		JOptionPane.showMessageDialog(null, funcionario.mostrar());
	}
}