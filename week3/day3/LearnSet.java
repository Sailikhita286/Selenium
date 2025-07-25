package week3.day3;


import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="google";
		char[] c=s.toCharArray();
		System.out.println();
		Set<Character> hi=new LinkedHashSet<Character>();
		
		for(int i=0;i<c.length;i++) {
			hi.add(c[i]);
			
		}
		System.out.println("The new set is:"+hi);

	}

}
