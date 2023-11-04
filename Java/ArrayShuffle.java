package ARRAYOPERATION;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayShuffle {

	Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };

	public static void main(String args[]) {
		ArrayShuffle ref = new ArrayShuffle();

		ref.OriginalArray();
		ref.Collection();
		ref.ShuffleArray();


		
	}
	
	public void OriginalArray() {
		
		System.out.println("  the original ARRAY");
		System.out.println(Arrays.toString(intArray));

		
	}
// Method to print the original  Array
	public void Collection() {
		System.out.println("Shuffled Array using collection  ");

		List<Integer> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);

		intList.toArray(intArray);

		System.out.println(Arrays.toString(intArray));
	}

	
	//Shuffled Array using Collection 

	

	//Shuffled Array using Random Class 
	public void ShuffleArray() {


		System.out.println("Shuffled Array using Random Class");
	    int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		
		Random rand = new Random();
		
		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}


}





	
