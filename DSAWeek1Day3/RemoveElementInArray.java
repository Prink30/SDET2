package DSAWeek1Day3;

import java.util.Arrays;

import org.junit.Test;

/*
Remove all occurrence of a number which is present in the given index number
input = {1,2,3,4,5,1}, indexToRemove = 5
output = {2,3,4,5} 
 */

public class RemoveElementInArray {

	@Test
	public void input() {
		int[] array1 = { 1, 2, 3, 4, 5, 1 };
		int elementtoremove = 1;

		removeelement(array1, elementtoremove);

	}

	private void removeelement(int[] array1, int removeelement) {

		int[] newarray = new int[array1.length - 2];
		int index = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != removeelement) {
				newarray[index++] = array1[i];
			}
		}

		System.out.println(Arrays.toString(newarray));

	}
}
