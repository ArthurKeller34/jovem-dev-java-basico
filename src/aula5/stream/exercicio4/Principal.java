package aula5.stream.exercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Principal extends Pessoa {

	

	public Principal(String string, String string2, LocalDate of) {
		super(string, string2, of);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
		listaDePessoas.add(new Pessoa("Arthur", "(48)99110-3008", LocalDate.of(2004, 07, 05)));
        listaDePessoas.add(new Pessoa("Valquíria", "(48)94112-5009", LocalDate.of(2002, 02, 28)));
        listaDePessoas.add(new Pessoa("Thaís", "(48)91230-9887", LocalDate.of(2007, 03, 30)));
        listaDePessoas.add(new Pessoa("João", "(48)95467-0132", LocalDate.of(2005, 05, 17)));
        listaDePessoas.add(new Pessoa("Mathues", "(48)94752-3912", LocalDate.of(2003, 03, 5)));
        listaDePessoas.add(new Pessoa("Ana", "(48)94007-5448", LocalDate.of(2005, 01, 6)));
        listaDePessoas.add(new Pessoa("Marcos", "(48)92330-8002", LocalDate.of(2006, 07, 8)));
        listaDePessoas.add(new Pessoa("Julia", "(48)91806-4334", LocalDate.of(2006, 8, 22)));
        listaDePessoas.add(new Pessoa("Guilherme", "(48)9636-9190", LocalDate.of(2001, 12, 31)));
        listaDePessoas.add(new Pessoa("Camila", "(48)95045-8779", LocalDate.of(2000, 10, 24)));
        Stream<Pessoa> listaNascidasMaio = listaDePessoas.stream(); 
        
	}
}
