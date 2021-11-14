package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		// Declare An array for {3,2,11,4,6,7};

		List<Integer> array1 = new ArrayList<Integer>();

		array1.add(3);
		array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);

		int sizearray1 = array1.size();

		System.out.println("size of array1 is " + sizearray1);

		List<Integer> array2 = new ArrayList<Integer>();

		// Declare another array for {1,2,8,4,9,7};

		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);

		int sizearray2 = array2.size();

		System.out.println("size of array2 is " + sizearray2);

		// Integer array2List = array2.get(sizearray2-1);

		// System.out.println(array2List);

		for (Integer getArray1 : array1) {

			int array1List = getArray1;

			for (Integer getArray2 : array2) {

				int array2List = getArray2;

				if (array1List == array2List) {

					List<Integer> CommonElement = new ArrayList<Integer>();

					CommonElement.add(array1List);

					System.out.println("The Common Elements are " + array1List);
				}

			}

			// System.out.print(getArray1);

		}

	}

}
