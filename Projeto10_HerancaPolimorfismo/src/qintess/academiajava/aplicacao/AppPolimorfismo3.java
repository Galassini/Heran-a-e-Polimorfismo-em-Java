package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPolimorfismo3 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Funcionario("Agenor", 27, Sexo.MASCULINO, "Assistente",5000);
		JOptionPane.showMessageDialog(null, pessoa1.mostrar());
		
		/*
		 * É possível alterar o código:
		
		Funcionario func = (Funcionario) pessoa1; //typeCast
		func.setIdade(28);
		func.setSalario(5500);
		 
		 *Por:
		 */
		if (pessoa1 instanceof Funcionario) {
			((Funcionario)pessoa1).setIdade(28);
			((Funcionario)pessoa1).setSalario(5500);
			JOptionPane.showMessageDialog(null, ((Funcionario)pessoa1).mostrar());
		}
		
		if (pessoa1 instanceof Aluno) {
			pessoa1.setIdade(29);
			((Aluno) pessoa1).setMatricula(122);
		} else {
			JOptionPane.showMessageDialog(null, "A variável pessoa1 NÃO referencia Aluno.");
		}
	}
}