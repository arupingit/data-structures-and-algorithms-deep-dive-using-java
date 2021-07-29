package com.arup.arrayalgo.challenges;

public class Challenge2 {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        insersionSort(intArray,intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    
    //recursive version of insersion sort 
    private static void insersionSort(int[] input, int numItems){
    	if(numItems<2){
    		return;
    	}
    	
    	insersionSort(input, numItems-1);
    	int newElement = input[numItems-1];
    	int i;
        
        for (i = numItems-1; i > 0 && input[i - 1] > newElement; i--) {
        	input[i] = input[i - 1];
        }

        input[i] = newElement;
    }
}
