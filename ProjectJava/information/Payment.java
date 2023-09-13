package information;
import order.*;
import java.util.Scanner;
public class Payment
{
	public int pay;
	public void paymentOption()
	{
		while(true)
		{
		System.out.println("Which One You Prefer For Payment");
		System.out.println("Press 1 For Cash on delivery");
		System.out.println("Press 2 For Bikash");
		
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		if(pay==1)
		{
			System.out.println("Thanks For Ordering. We will deliver your food with in 20 minutes");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			OrderBillWrite obw = new OrderBillWrite();
			obw.writeInFile("Customer will pay Cash on delivery ");
			obw.writeInFile("~~~~~~~~~~~~~~~~~~~~~~~~~");
			break;
		}
		else if(pay==2)
		{
			System.out.println("our Bikash Number is 01198141488.");
			System.out.println("Please pay your bill and confirm your order.");
			System.out.println("We will deliver your food within 20 minutes after confirming your order.Thank You");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			OrderBillWrite obw = new OrderBillWrite();
			obw.writeInFile("Customer will pay via Bikash ");
			obw.writeInFile("~~~~~~~~~~~~~~~~~~~~~~~~~");
			break;
		}
		else
		{
			System.out.println("Sorry!! Foods Are Not Free");
			continue ;
		}
		}
	}

}