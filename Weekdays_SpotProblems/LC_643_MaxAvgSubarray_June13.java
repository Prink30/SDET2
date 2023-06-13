package Weekdays_SpotProblems;

import org.junit.Assert;
import org.junit.Test;



public class LC_643_MaxAvgSubarray_June13 {

/*	@SuppressWarnings("deprecation")
	@Test
	public void input1() {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		maximumAvgSubarray(nums,k);
		//Double.toString(maximumAvgSubarray(nums, k));
		 //System.out.println(maximumAvgSubarray(nums,k));	
		Assert.assertEquals("12.75",Double.toString(maximumAvgSubarray(nums, k)));
		
		//Assert.assertEquals(12.75, maximumAvgSubarray(nums, k));
	} */

	
	@SuppressWarnings("deprecation")
	@Test
	public void input2() {
		int[] nums = { 5 };
		int k = 1;
		// System.out.println(maximumavgsubarray(nums,k));
		Assert.assertEquals("5",Double.toString(maximumAvgSubarray(nums, k)));
	} 

	private double maximumAvgSubarray(int[] nums, int k) {

		double sum = 0, avg = 0, max = 0;
		
       if(nums.length==1 && k==1) {
    	   return nums[0];
       }
       
		for (int i = 0; i < k; i++) {
			sum = sum + nums[i];

		}

		avg = sum / k;
		max = avg;

		for (int j = 1; j < nums.length - k; j++) {
			sum = sum - nums[j - 1] + nums[j + k - 1];
			avg = sum / k;
			if (avg > max) { // max=Math.max(avg,max)
				max = avg;

			}
		}
        
		//System.out.println(max);
		return max;

	}
}
