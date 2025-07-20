package week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1="stops";
		String text2="potss";

        
        text1 = text1.toLowerCase();
        text2 = text2.toLowerCase();

        
        if (text1.length() != text2.length()) {
            System.out.println("The given string are not anagrams");
        } else {
            
            char[] charArray1 = text1.toCharArray();
            char[] charArray2 = text2.toCharArray();

            
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("They are anagrams");
            } else {
                System.out.println("The given string are not anagrams");
            }
        }
	}
}


