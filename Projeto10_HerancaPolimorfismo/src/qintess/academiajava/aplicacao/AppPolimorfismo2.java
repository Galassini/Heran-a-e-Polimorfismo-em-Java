package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPolimorfismo2 {
	public static void main(String[] args) {
		
		//vari�vel Pessoa, objeto Funcionario
		Pessoa pessoa1 = new Funcionario("Agenor", 27, Sexo.MASCULINO, "Assistente", 5000);
		JOptionPane.showMessageDialog(null, pessoa1.mostrar());
		
		//Desejamos alterar a idade e o salario deste funcionario.
		
		/*
		 * A vari�vel pessoa1 � do tipo Pessoa. Apesar de sabermos que ela referencia
		 * um objeto do tipo Funcionario, o compilador n�o tem como detectar, pois
		 * objetos s�o criados na execu��o, enquanto que as vari�veis s�o criadas
		 * durante a compila��o.
		 * 
		 * Para que uma vari�vel da subclasse (Funcionario) referencie o mesmo objeto
		 * referenciado por uma vari�vel da superclasse (Pessoa), devemos fazer a
		 * opera��o typecast.
		 */
		if(pessoa1 instanceof Funcionario) {
			Funcionario func = (Funcionario)pessoa1;
			//pessoa1.setIdade(28);
			func.setIdade(28);
			func.setSalario(5500);
			JOptionPane.showMessageDialog(null, pessoa1.mostrar());
		}
		
		//efeito colateral: quando as referencias s�o enganosas
		if(pessoa1 instanceof Aluno) {
			Aluno aluno = (Aluno)pessoa1;
			aluno.setMatricula(122);
		}else {
			JOptionPane.showMessageDialog(null, "A vari�vel pessoa1 N�O referencia Aluno");
		}
		
	}
}
