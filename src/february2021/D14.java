package february2021;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class D14 {

	/*
	 * Given a list of numbers and a number k, return whether any two numbers from
	 * the list add up to k.
	 * 
	 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is
	 * 17.
	 */

	private static Boolean existeSuma(List<Integer> numeros, int suma) {
		Boolean res = false;
		Map<Integer, Integer> mem = new HashMap<>();
		int i = 0;
		while (i < numeros.size()) {
			if (!mem.containsValue(suma - numeros.get(i))) {
				mem.put(i, numeros.get(i));
			} else {
				res = true;
			}
			i++;
		}
		return res;
	}

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 8, 3, 1, 2, 3, 4, 2, 2, 1, 2, 4, 1, 1, 123, 123, 123, 123, 6, 3, 2,
				2, 1, 21, 4, 7, 2, 3, 3, 120, 120);
		System.out.println(existeSuma(numeros, 240));

	}

}
