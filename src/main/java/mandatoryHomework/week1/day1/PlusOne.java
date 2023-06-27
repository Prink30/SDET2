package SDET;

import java.util.Arrays;

import org.junit.Test;

public class PlusOne {
	
	/*
	 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least
	 * significant in left-to-right order. The large integer does not contain any leading 0's.
       Increment the large integer by one and return the resulting array of digits.
	 */

	@Test
	public void input1() {
		int[] array1 = { 1, 2, 3 };// Input Array-->
		System.out.println(Arrays.toString(plusOne(array1)));

	}

	@Test
	public void input2() {
		int[] array1 = { 1, 9 };// Input Array-->
		System.out.println(Arrays.toString(plusOne(array1)));

	}

	private int[] plusOne(int[] array1) {

		int n = array1.length;
		for (int i = n - 1; i >= 0; i--) // 1 2 3
		{
			if (array1[i] < 9) {
				array1[i]++;
				return array1;
			}
			array1[i] = 0;
		}

		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;
		return newNumber;
	}
}
