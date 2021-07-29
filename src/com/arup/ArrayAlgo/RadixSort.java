package com.arup.arrayalgo;

public class RadixSort {

	public static void main(String[] args) {
		
		int[] intArray = {1330,8792,1594,4725,4586,5729};
		for(int i=0;i<=4;i++){
			intArray = stableCountSort(intArray,i);
		}
		printintArray(intArray);
	}
	
	private static int[] stableCountSort(int[] intArray, int n){
		int[] intArrayCopy = new int[intArray.length];
		int radixPos = (int)Math.pow(10,n); 
		int max = 9;
		int min = 0;
		int[] temp = new int[max-min+1];
		for(int i=0; i < intArray.length; i++){
			++temp[getRedix(intArray[i],radixPos) - min];
		}
		
		for(int i=1; i< temp.length; i++){
			temp[i] = temp[i] + temp[i-1];
		}
		for(int k=intArray.length-1; k>=0; k--){
			intArrayCopy[(temp[getRedix(intArray[k],radixPos)]--)-1] = intArray[k];
		}
		return intArrayCopy;
	}

	private static void printintArray(int[] args){
		for(int i=0; i< args.length; i++){
			System.out.println(args[i]);
		}
	}
	
	private static int getRedix(int i,int position){
		return (i%(position*10))/position;
	}
}
