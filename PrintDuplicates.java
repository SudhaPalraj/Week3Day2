package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

		// Set<Integer> sample = new
		// LinkedHashSet<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));

		Set<Integer> sample = new LinkedHashSet<Integer>();

		for (Integer temp : arr) {

			boolean added = sample.add(temp);

			if (!added) {

				System.out.println(temp);
			}

		}

		// System.out.println(sample);

	}

}
