package com.arup.ArrayAlgo;

public class InsersionSort {

	public static void main(String[] args) {
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		for(int firstUnsortedIndex = 1;firstUnsortedIndex<intArray.length;firstUnsortedIndex++){
			int newElement = intArray[firstUnsortedIndex];
			int i;
			for(i=firstUnsortedIndex;i>0 && intArray[i-1]>newElement;i--){
				intArray[i] = intArray[i-1];
			}
			intArray[i] = newElement;
		}

		printintArray(intArray);

	}
	
	
	private static void printintArray(int[] args){
		for(int i=0; i< args.length; i++){
			System.out.println(args[i]);
		}
	}
}
