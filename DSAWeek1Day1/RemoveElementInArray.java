package DSAWeek1Day1;

import java.util.Arrays;

import org.junit.Test;

public class RemoveElementInArray {
	
	// Remove the value from an array
	@Test
	public void input() {
		int[] array1 = { 7, 8, 4, 5 };
		int elementtoremove = 4;

		removeelement(array1, elementtoremove);

	}

	private void removeelement(int[] array1, int removeelement) {

		int[] newarray = new int[array1.length - 1];
		int index = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != removeelement) {
				newarray[index++] = array1[i];
			}
		}

		System.out.println(Arrays.toString(newarray));

	}
}
