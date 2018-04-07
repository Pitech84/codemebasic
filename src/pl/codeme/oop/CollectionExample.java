package pl.codeme.oop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class CollectionExample {

	public static void main(String[] args) {
		// exSet();
//		exList();
//		exMap();
		exProperties();
	}

	
	private static void exProperties() {
		
		Properties p = System.getProperties();
		Set<Object> keys = p.keySet();
		
		for (Object key: keys) {
			System.out.println(key + " : " + p.get(key));
		}
//		p.getProperty("Klucz"); - trzeba podac klucz z listy to nam zwroci value
	}


	private static void exMap() {
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("Imię", "Marek");
		hm.put("Wiek", "18");
		
		System.out.println("Imię" + hm.get("Imię"));
		
		Set<String> keys = hm.keySet();
		
		for (String key: keys) {
			System.out.println(key + ": " + hm.get(key));
		}
	}

	private static void exList() {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Ala");
		al.add("Kota");
		al.add(1, "Ma"); // dajac add "rozchyla" obiekty na miejscu 0 i 1
								// i wstawia sie w 1, jedynka przeskakuje na 2
								// miesjce
		al.set(0, "Jarek");
		

		System.out.println("Ilość elementów: " + al.size());
		
		for( String el: al)
			System.out.println(el);
		
		System.out.println("Pobieram " + al.get(1));

	}

	private static void exSet() {
		HashSet<String> hs = new HashSet<String>();

		hs.add("X");
		hs.add("O");

		System.out.println("Ilość elementów" + hs.size());
		System.out.println("Czy jest X? " + hs.contains("X"));
		System.out.println("Czy jest Y? " + hs.contains("Y"));

		hs.remove("O");
		for (String el : hs) {
			System.out.print(el + " ");
		}
	}

}
