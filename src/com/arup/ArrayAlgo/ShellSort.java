package com.arup.arrayalgo;
/**
 * Shell sort version of insersion sort where gap is half of array length
 * @author arupdutta
 */
public class ShellSort {
	
	public static void main(String[] args) {

		int[] intArray = {20,35,-15,7,55,1,-22};
		
		for(int gap=intArray.length/2; gap>0 ; gap = gap/2){
			for(int i = gap; i<intArray.length; i++){
				int key = intArray[i];
				int j = i;
				while(j>=gap && intArray[j - gap]>key){
					intArray[j] = intArray[j - gap];
					j = j - gap;
				}
				intArray[j] = key;
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
