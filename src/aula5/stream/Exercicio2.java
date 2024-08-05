package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		List<Integer> listaNumeros = new ArrayList<Integer>();
		Random r = new Random();
		for ( int i=0; i<50; i++) {
			listaNumeros.add(r.nextInt(101));
		}
	}
}