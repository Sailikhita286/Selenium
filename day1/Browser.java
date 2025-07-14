package week2.day1;

public class Browser {
;
		public String launchBrowser(String browserName)
		{
		System.out.println("browser launch successfully");
		return browserName ;
		}
		public void loadUrl()
		{
			System.out.println("application url loaded sucessfully");
		}
		
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			Browser brow=new Browser();
			String s=brow.launchBrowser("GoogleChrome");
			System.out.println(s);
			brow.loadUrl();
		
		

	}

}
