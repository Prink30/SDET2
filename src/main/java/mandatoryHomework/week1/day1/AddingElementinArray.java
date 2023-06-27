package DSAWeek1Day1;

import java.util.Arrays;

import org.junit.Test;

public class AddingElementinArray {
	
	// Add an element to the specific index

	@Test
	public void Test() {
		int[] array1 = { 4, 5, 6, 7 };
		int newnumbr = 2;
		AddElement(array1, newnumbr);
	}

	private void AddElement(int[] array1, int newnumbr) {
		int[] array2 = new int[array1.length + 1];
		int i;
		for (i = 0; i < array1.length; i++) {

			array2[i] = array1[i];
		}
		array2[i] = newnumbr;
		System.out.println(Arrays.toString(array2));

	}

}
