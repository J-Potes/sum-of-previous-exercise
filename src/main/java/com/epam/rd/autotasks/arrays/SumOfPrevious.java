package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        //put your code here
    	boolean[] boolArray = new boolean[array.length];
    	boolArray[0] = false;
    	boolArray[1] = false;
    	
    	for(int i = 2; i < array.length; i++) {
    		boolean isSum = false;
    		for(int j = 0; j < (i-1); j++) {
    			if((array[j] + array[j+1]) == array[i]) {
    				isSum = true;
    				break;
    			}
    		}
    		if(isSum == true) {
    			boolArray[i] = true;
    		}
    		else {
    			boolArray[i] = false;
    		}
    	}
    	return boolArray;
    }
}
