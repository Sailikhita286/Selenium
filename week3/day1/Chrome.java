package week3.day1;

public class Chrome extends Browser {

	
		// TODO Auto-generated method stub
		public void openIncoginto() {
			System.out.println("opening Incoginto");
	}
		public void clearCache() {
			System.out.println("clearing");
		}
		public static void main(String[] args) {
			Chrome b=new Chrome();
			b.openIncoginto();
			b.clearCache();
			b.OpenURL();
			b.closeBrowser();
			
		}
		

}
