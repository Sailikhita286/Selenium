package week1.day2;

public class FibnocciSeries {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int f1=0,f2=1,f3;
		System.out.println("the series is");
		System.out.println(f1);
		System.out.println(f2);
		for (int i = 2; i < num; i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f3;
			f2=f3;
			
		}
	}

}
