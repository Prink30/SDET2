package DSAWeek1Day2;

import java.util.Arrays;

/*
 Remove the first and last occurrence of a given number in the input array
input = {1,2,3,4,5,1}, number = 1
output = {2,3,5}
 */

import org.junit.Test;

public class RemovefirstandLast {

	@Test
	public void input() {
		int[] array1 = { 1, 2, 3, 4, 1 };
		int elementtoremove = 1;
		firstandlast(array1, elementtoremove);

	}

	private void firstandlast(int[] array1, int elementtoremove) {

		int[] array2 = new int[array1.length - 2];

		int index = 0;

		if (array1[0] == elementtoremove && array1[array1.length - 1] == elementtoremove) {
			for (int i = 1; i < array1.length - 1; i++) {   
				array2[index++] = array1[i];

			}
			System.out.println(Arrays.toString(array2));
		}

	}
}
