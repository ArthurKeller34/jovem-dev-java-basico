package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			numeros.add(r.nextInt(101));
		}
		for (int numero : numeros) {
			if (numero > 50) {
				System.out.println(numero);
			}
		}
	}
}
