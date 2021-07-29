package com.arup.arrayalgo;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex >0; --lastUnsortedIndex){
			for(int i=0; i< lastUnsortedIndex;i++){
				int j = i+1;
				if(intArray[i]>intArray[j]){
					swap(intArray,i,j);
				}
			}
		}
		
		printintArray(intArray);
	}
	
	private static void swap(int[] args, int i, int j){
		if(i == j){
			return;
		}
		
		int temp = args[i];
		args[i] = args[j];
		args[j] = temp;
	}
	
	private static void printintArray(int[] args){
		for(int i=0; i< args.length; i++){
			System.out.println(args[i]);
		}
	}

}
