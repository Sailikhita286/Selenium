package week3.day1;

public class Report {

	
		
		public void reportSetup(String m, String s)
		{
			System.out.println(m+s);
		}
		public void reportSetup(String m, String s,boolean snap)
		{
			System.out.println(m+s);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Report r=new Report();
			r.reportSetup("m", "s");
		

	}

}
