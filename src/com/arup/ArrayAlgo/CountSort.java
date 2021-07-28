package com.arup.ArrayAlgo;

public class CountSort {

	public static void main(String[] args) {
		
		int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
		int min = 2;
		int max = 10;
		
		int[] temp = new int[max - min + 1];
		
		for(int i=0; i<intArray.length; i++){
			++temp[intArray[i] - min];
		}
		
		int j = 0;
		for(int i = min;i<=max;i++){
			while(temp[i-min]>0){
				intArray[j++] = i;
				temp[i-min]--;
			}
		}
		
		
		
		printintArray(intArray);
		
	}
	
	private static void printintArray(int[] args){
		for(int i=0; i< args.length; i++){
			System.out.println(args[i]);
		}
	}

}
