package generics.Interface.function.lambdaDeclarada.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import generics.Interface.function.lambdaDeclarada.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		Function<Product, String> func = p -> p.getName().toUpperCase();
		
		// map so funciona para stream n�o funciona para lista
		List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		names.forEach(System.out::println);
	}
}