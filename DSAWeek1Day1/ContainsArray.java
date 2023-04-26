package DSAWeek1Day1;

import org.junit.Test;

public class ContainsArray {
	
	// Verify the element is present in array

	@Test
	public void positive() {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int numbr = 3;
		boolean result = false;
		arrayContains(array1, numbr, result);

	}

	@Test
	public void Negative() {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int numbr = 6;
		boolean result = false;
		arrayContains(array1, numbr, result);

	}

	private void arrayContains(int[] array1, int numbr, boolean result) {

		for (int n : array1) {
			if (n == numbr) {
				result = true;
				break;
			}
		}

		if (result) {

			System.out.println("Array had this element" + " " + numbr);
		} else {
			System.out.println("Array doesn't had this element" + " " + numbr);
		}

	}

}
