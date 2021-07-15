package com.arup.ArrayAlgo;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] intArray = {20,35,-15,7,55,1,-22};
		

		mergeSort(intArray,0,intArray.length);
		
		printintArray(intArray);
	}
	
	
	private static void mergeSort(int[] intArray, int start, int end){
		
		if((end-start)<2){
			return;
		}
		
		int mid = (start + end)/2;
		mergeSort(intArray, start, mid);
		mergeSort(intArray, mid, end);
		merge(intArray,start,mid,end);	
	}
	
	public static void merge(int[] intArray, int start, int mid, int last){
		if(intArray[mid-1] <= intArray[mid]){
			return;
		}
		int i=start, j=mid, k=0;
		int[] tempArray = new int[last-start];
		while(i<mid && j<last){
			tempArray[k++] = (intArray[i] <= intArray[j]) ? intArray[i++] : intArray[j++];
		}
		
		while(i<mid){
			tempArray[k++] = intArray[i++];
		}
		
		System.arraycopy(intArray, i, intArray, start+k, mid-i);
		System.arraycopy(tempArray, 0, intArray, start, k);
		
	}
	
	private static void printintArray(int[] args){
		for(int i=0; i< args.length; i++){
			System.out.println(args[i]);
		}
	}

}
