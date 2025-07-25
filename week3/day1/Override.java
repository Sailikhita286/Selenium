package week3.day1;

public class Override extends Report {

	
		// TODO Auto-generated method stub
		public void takeSnap() {
		System.out.println("takesnap method");

	}
		public void reportSetup(String m,String s) {
			super.reportSetup(m, s);
			System.out.println("with args");
		}
		public static void main(String[] args) {
			Override o=new Override();
			o.takeSnap();
			o.reportSetup("m", "s");
			o.reportSetup("m", "s", true);
			
		}


}
