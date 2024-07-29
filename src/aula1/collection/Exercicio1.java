package aula1.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Exercicio1 {

		public static void main(String[] args) {
			
			List<Integer> lista = new ArrayList<>();
			Random r = new Random ();
			for ( int i=0; i<50; i++) {
				lista.add(r.nextInt(100));
				if (i==50) {
					System.out.println(lista);
				}
			}Collections.sort(lista);
			System.out.println(lista);
			
		}
}
