package qintess.academiajava.aplicacao;

import javax.swing.JOptionPane;

import qintess.academiajava.classes.Aluno;
import qintess.academiajava.classes.Funcionario;
import qintess.academiajava.classes.Pessoa;
import qintess.academiajava.enumeracoes.Sexo;

public class AppPolimorfismo2 {
	public static void main(String[] args) {
		
		//variável Pessoa, objeto Funcionario
		Pessoa pessoa1 = new Funcionario("Agenor", 27, Sexo.MASCULINO, "Assistente", 5000);
		JOptionPane.showMessageDialog(null, pessoa1.mostrar());
		
		//Desejamos alterar a idade e o salario deste funcionario.
		
		/*
		 * A variável pessoa1 é do tipo Pessoa. Apesar de sabermos que ela referencia
		 * um objeto do tipo Funcionario, o compilador não tem como detectar, pois
		 * objetos são criados na execução, enquanto que as variáveis são criadas
		 * durante a compilação.
		 * 
		 * Para que uma variável da subclasse (Funcionario) referencie o mesmo objeto
		 * referenciado por uma variável da superclasse (Pessoa), devemos fazer a
		 * operação typecast.
		 */
		if(pessoa1 instanceof Funcionario) {
			Funcionario func = (Funcionario)pessoa1;
			//pessoa1.setIdade(28);
			func.setIdade(28);
			func.setSalario(5500);
			JOptionPane.showMessageDialog(null, pessoa1.mostrar());
		}
		
		//efeito colateral: quando as referencias são enganosas
		if(pessoa1 instanceof Aluno) {
			Aluno aluno = (Aluno)pessoa1;
			aluno.setMatricula(122);
		}else {
			JOptionPane.showMessageDialog(null, "A variável pessoa1 NÃO referencia Aluno");
		}
		
	}
}
