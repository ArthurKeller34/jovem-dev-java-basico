package aula2.poo.exercicio5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Principal  {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		String[] nomes = { "Arthur", "Thaís" };
		LocalDate[] datas = { LocalDate.parse("2005-08-30"), LocalDate.parse("2004-12-15") };
		for (int i = 0; i < nomes.length; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(nomes[i]);
			pessoa.setDataNascimento(datas[i]);
			pessoas.add(pessoa);
			
		}
		Pessoa pessoa1 = pessoas.get(0);
		Pessoa pessoa2 = pessoas.get(1);
		if (pessoa1.getDataNascimento().isBefore(pessoa2.getDataNascimento())) {
			System.out.println("0(A) " + pessoa1 + " é mais velho(a)");
		} else {
			System.out.println("O(A) " + pessoa2 + " e´mais velho(a)");
		}
	}
}
