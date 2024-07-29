package aula1.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		List<Integer> listaOrdenada = new ArrayList<>();
		Random r = new Random ();
		for ( int i=0; i<50; i++) {
			lista.add(r.nextInt(100));
			if (i==50) {
				System.out.println(lista);
			}
		}lista.stream().sorted(Comparator.reverseOrder()).forEach(p -> listaOrdenada.add(p));
		System.out.println(listaOrdenada);
	}
}