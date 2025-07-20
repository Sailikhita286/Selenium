package week2.day2;

public class ChangeOddIndex {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		String text="changeme";
		char[] c=text.toCharArray();
		for( int i=0;i<c.length;i++) {
			if(i%2!=0) {
				c[i]=Character.toUpperCase(c[i]);
			}
		}
		System.out.println("New string is "+ " " +new String(c));
	}

	}
