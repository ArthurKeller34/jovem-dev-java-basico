package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercicio2 {

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			numeros.add(r.nextInt(101));
		}
		List<Integer> numerosMaiores50 = numeros.stream()
				.filter(num -> num > 50)
				.collect(Collectors.toList());
		System.out.println(numerosMaiores50);
	}

}
