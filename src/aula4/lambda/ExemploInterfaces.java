package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class ExemploInterfaces {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.forEach(System.out::println);
	}
}
