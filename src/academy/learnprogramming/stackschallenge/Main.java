package academy.learnprogramming.stackschallenge;

import java.util.Deque;
import java.util.LinkedList;   

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
    	if(string.length()==0){
    		return false;
    	}
    	String lowercase = string.toLowerCase();
    	StringBuilder puntucationRemovedString = new StringBuilder(string.length());
    	for(int i=0;i<string.length();i++){
    		char c = lowercase.charAt(i);
    		if('a'<=c && c<='z'){
    			puntucationRemovedString.append(c);
    		}
    	}
    	
    	Deque<Character> stack = new LinkedList<>();
    	for(int i=0;i<puntucationRemovedString.length();i++){
    		stack.push(puntucationRemovedString.charAt(i));
    	}
    	
    	StringBuilder secondString = new StringBuilder(puntucationRemovedString.length());
    	while(stack.peek()!=null){
    		secondString.append(stack.pop());
    	}
    	
    	return puntucationRemovedString.toString().equals(secondString.toString());
    	
    }
}
