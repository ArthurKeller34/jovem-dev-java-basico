package aula1.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Exercicio3 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 50; i++) {
			lista.add(r.nextInt(20));
		}
		Collections.sort(lista);
		System.out.println(lista);
		Set<Integer> conjunto = new HashSet<>();
		conjunto.addAll(lista);
		System.out.println(conjunto);
	}
}
