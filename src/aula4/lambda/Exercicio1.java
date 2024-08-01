package aula4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {

		List<Integer> lista = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(100));
		}
		lista.forEach(System.out::println);
	}
}
