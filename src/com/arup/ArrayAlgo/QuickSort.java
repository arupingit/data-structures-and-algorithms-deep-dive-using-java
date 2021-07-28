package com.arup.ArrayAlgo;

public class QuickSort {
	
	public static void main(String[] args){
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		quickSort(intArray,0,intArray.length);
		
		printintArray(intArray);

	}
	
	private static void printintArray(int[] args){
		for(int i=0; i< args.length; i++){
			System.out.println(args[i]);
		}
	}
	
	public static void quickSort(int[] arr, int start, int end){
		
		if(end-start < 2){
			return;
		}
		
		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot);
		quickSort(arr, pivot + 1, end);
	}
	
	public static int partition(int[] arr, int start, int end){
		int pivotVal = arr[start];
		int i = start;
		int j = end;
		
		while(i<j){
			while(i<j && arr[--j]>=pivotVal);
			if(i<j){
				arr[i] = arr[j];
			}
			while(i<j && arr[++i]<=pivotVal);
			if(i<j){
				arr[j] = arr[i];
			}
		}
		arr[j] = pivotVal;
		return j;
	}

}
