package com.arup.arrayalgo.challenges;
/*
 * redix sort for sorting Stings
 */
public class Challenge3 {

    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        // do radix sort
        for(int i=4;i>=0;i--){
        	stringsArray = stableCountSort(stringsArray,i);
		}

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }
    
    private static String[] stableCountSort(String[] stringsArray, int n){
    	String[] stringsArrayCopy = new String[stringsArray.length];
		int radixPos = n; 
		char max = 'z';
		char min = 'a';
		int[] temp = new int[max-min+1];
		for(int i=0; i < stringsArray.length; i++){
			++temp[getRedix(stringsArray[i],radixPos) - min];
		}
		
		for(int i=1; i< temp.length; i++){
			temp[i] = temp[i] + temp[i-1];
		}
		
		
		for(int k=stringsArray.length-1; k>=0; k--){
			stringsArrayCopy[(temp[getRedix(stringsArray[k],radixPos)-min]--)-1] = stringsArray[k];
		}
		return stringsArrayCopy;
	}
    
    private static char getRedix(String i,int position){
		return i.charAt(position);
	}
    
}
