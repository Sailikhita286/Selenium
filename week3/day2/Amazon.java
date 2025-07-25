package week3.day2;

public class Amazon  extends CanaraBank{

	@Override
	public void cashonDelivery()
	{
		System.out.println("pay at delivery");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void upiPayments() 
	{
		System.out.println("pay through upi");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardPayments()
	{
		System.out.println("pay through card");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Pay through Internet banking");
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Amazon a=new Amazon();
		a.cardPayments();
		a.internetBanking();
		a.upiPayments();
		a.cashonDelivery();
		
	}

}
