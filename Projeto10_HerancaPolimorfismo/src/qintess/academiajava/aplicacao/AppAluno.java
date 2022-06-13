package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Curso;
import qintess.academiajava.enumeracoes.Sexo;

public class AppAluno {
	public static void main(String[] args) {
		// Definindo o objeto Curso
		
		Curso curso = new Curso("Fundamentos Java", 100, 1200);
		
		//Definindo o objeto Aluno
		
		Aluno aluno1 = new Aluno("Osvaldo Cardoso", 25, Sexo.MASCULINO, 1234);
		JOptionPane.showMessageDialog(null, aluno1.mostrar());
		
		
		Aluno aluno2 = new Aluno("Osvaldo Silva", 52, Sexo.MASCULINO, 3361, curso);
		JOptionPane.showMessageDialog(null, aluno2.mostrar());
		
		
		Aluno aluno3 = new Aluno(
				"Mariana Soares", //NOME DO ALUNO
				30, // IDADE DO ALUNO
				Sexo.FEMININO, //SEXO DO ALUNO
				2215, //MATRICULA DO ALUNO
				new Curso("Psicologia", 4000, 2000) //CURSO DO ALUNO
				);
		JOptionPane.showMessageDialog(null, aluno3.mostrar());
	}
}