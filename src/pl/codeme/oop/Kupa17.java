package pl.codeme.oop;

import java.util.ArrayList;
import java.util.List;

public class Kupa17 {

	public static void main(String[] args) {

		List<Integer> array = new ArrayList<>();
		for (int p = 2; p < 1000; p++) {
			boolean isOK = isOk(p);
			if (isOK) {
				array.add(p);
			}

		}
		array.stream().forEach(System.out::println);
	}

	public static boolean isOk(int d) {
		boolean t = true;
		int i = 2;
		for (;;) {
			if (i >= d) {
				return t;
			}
			if (d % i != 0) {
				i++;
			} else {
				return false;
			}
		}

	}

}
