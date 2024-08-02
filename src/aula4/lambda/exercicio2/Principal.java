package aula4.lambda.exercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
		String[] nomes = { "Arthur", "Carlos", "Thaís", "Matheus", "Camila" };
		LocalDate[] datas = { LocalDate.parse("2004-10-19"),
		LocalDate.parse("2008-08-30"),
		LocalDate.parse("1996-12-04"),
		LocalDate.parse("2014-12-25"),
		LocalDate.parse("2004-01-03")};
		int[] numeroaDaChamada = { 1, 3, 14, 11, 2 };

		for (int i = 0; i < nomes.length; i++) {
			Aluno aluno = new Aluno();
			aluno.setNome(nomes[i]);
			aluno.setDataNascimento(datas[i]);
			aluno.setNumeroChamada(numeroaDaChamada[i]);
			listaDeAlunos.add(aluno);
		}
		System.out.println(listaDeAlunos);

	}
}