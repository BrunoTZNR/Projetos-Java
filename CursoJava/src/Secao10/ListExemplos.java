package Secao10;

import java.util.ArrayList;
import java.util.List;

public class ListExemplos {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Bruno");
		list.add("Bianca");
		list.add("Renan");
		list.add("Italo");
		list.add("Ésoj");
		list.add("Douglas");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("---------------");
		
		list.remove("Ésoj");
		list.remove(4);
		
		list.removeIf(x -> x.charAt(0) == 'R');
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("---------------");
		
		System.out.println("Index of Renan: " + list.indexOf("Renan"));
		System.out.println("Index of Bruno: " + list.indexOf("Bruno"));
		
		System.out.println("---------------");
		
		
	}

}
