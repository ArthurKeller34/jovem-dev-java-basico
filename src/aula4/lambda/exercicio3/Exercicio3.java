package aula4.lambda.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 extends Pessoa {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		String[] nomes = { "Arthur", "Thiago", "Joao", "Thaís", "Ana" };
		for (int i = 0; i < nomes.length; i++) {
			Pessoa pessoa = new Pessoa();
			pessoa.setNome(nomes[i]);
			pessoas.add(pessoa);
		}
		pessoas.removeIf((p -> p.getNome().startsWith("T") && p.getNome().endsWith("o")));
		System.out.println(pessoas);
	}

}
