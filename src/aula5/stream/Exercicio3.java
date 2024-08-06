package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {

		List<Integer> numeros = new ArrayList<Integer>();
		Random r = new Random();
		int quantidade25 = 0;
		for (int i = 0; i < 50; i++) {
			int numero = r.nextInt(101);
			if (numero == 0) {
				i--;
			} else {
				numeros.add(numero);

			}
			if (numero == 25) {
				quantidade25++;
			}

		}
		System.out.println(numeros);
		System.out.println(quantidade25);
	} 
}
