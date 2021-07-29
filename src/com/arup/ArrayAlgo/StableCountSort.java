package com.arup.arrayalgo;
/**
 * Stable count sort algorithm based on 10th position
 * @author arupdutta
 *
 */
public class StableCountSort {

	public static void main(String[] args) {
		
		int[] intArray = {1330,8792,1594,4725,4586,5729};
		int[] intArrayCopy = new int[intArray.length];
		int max = 9;
		int min = 0;
		int[] temp = new int[max-min+1];
		for(int i=0; i < intArray.length; i++){
			++temp[getRedix(intArray[i],10) - min];
		}
		
		for(int i=1; i< temp.length; i++){
			temp[i] = temp[i] + temp[i-1];
		}
		
		for(int k=intArray.length-1;k>=0;k--){
			intArrayCopy[(temp[getRedix(intArray[k],10)]--)-1] = intArray[k] ;
		}
		printintArray(intArrayCopy);
	}
	
	private static int getRedix(int i,int position){
		return (i%(position*10))/position;
	}
	
	private static void printintArray(int[] args){
		for(int i=0; i< args.length; i++){
			System.out.println(args[i]);
		}
	}

}
