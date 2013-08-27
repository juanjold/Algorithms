import java.util.HashMap;
import java.util.Arrays;
/*
// Implement an algorithm to determine if a string has all unique characters. 
// @author Juan Jose Lopez Delgado
// 26-08-13
*/


public class uniqueTester {
    
    public uniqueTester(){

    }
    
    public boolean Test (String cin) {
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
	char[] charArr = cin.toCharArray();
	
	for (char c : charArr) {
	    if(map.get(c) == null) {
		map.put(c,1);
	    } else
		return false;
	}
	return true;
    }

    public boolean TestArray (String cin) {
	char[] charArr = cin.toCharArray();
	Arrays.sort(charArr);
	
	for ( int i = 1; i < charArr.length; i++ ) {
	    if (charArr[i] == charArr[i-1])
		return false;
	}
	return true;
    }

    public boolean TestNoSpace (String cin) { //no extra space use, complexity O(n^2) though
	for (int i = 0; i < cin.length(); i++) {
	    for (int j = i + 1; j < cin.length(); j++) {
		if(cin.charAt(i) == cin.charAt(j)) { return false; }
	    }
	}
	return true;
    }

    public static void main (String[] args) {
	uniqueTester test = new uniqueTester();
	System.out.println("Testing HashMap Solution: ");
	for (String s : args) {
	    System.out.println(test.Test(s));
	}
	System.out.println("Testing Array Solution: ");
	for (String s : args) {
	    System.out.println(test.TestArray(s));
	}
	System.out.println("Testing Comparison Solution: ");
	for (String s : args) {
	    System.out.println(test.TestNoSpace(s));
	}
    }
}