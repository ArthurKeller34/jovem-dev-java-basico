package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Exercicio3 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			int numero = r.nextInt(101);
			if (numero == 0) {
				i--;
			} else {
				numeros.add(numero);

			}

		}
		long quantidade25 = numeros.stream().filter(num -> num == 25).count();
		System.out.println(numeros);
		System.out.println(quantidade25);
	}
}
