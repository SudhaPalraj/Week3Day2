package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] data = {3,2,11,4,6,7};
		
		List<Integer> dataList =new ArrayList<Integer>();
		
		dataList.add(3)	;	
		dataList.add(2)	;
		dataList.add(11);
		dataList.add(4)	;
		dataList.add(6)	;
		dataList.add(7)	;
		
		System.out.println("Data in List " +dataList);
		
		Collections.sort(dataList);
		
		System.out.println("Sorted List is "+dataList);
		
		int sizeList = dataList.size();
		
		System.out.println("The size of list " +sizeList);
		
		
		Integer SecondLar = dataList.get(sizeList-2);
		
		System.out.println("The second Largest number is "+SecondLar);
		
	}

}
