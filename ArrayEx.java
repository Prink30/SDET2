package SDET;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Adding element to the specific index in an array
		int newnumbr=2;
		int[] array1 = {4,5,6,7};
		
		int[] array2 = new int[array1.length+1];
		
		int i;
		for( i=0;i<array1.length;i++) {  // i=0,i<4; i=1,1<4; i=2,2<4; i=3,3<4;
			                                
		array2[i]	=array1[i];
		}
           
		System.out.println(Arrays.toString(array2));
		
            array2[i] = newnumbr;
            System.out.println(Arrays.toString(array2));
            
	}

}
