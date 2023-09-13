import welcome.*;
import order.*;
import information.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] arg)
	{
		while(true)
	{
		try
	{
		IWelcome.intro();
		Resturant r = new Resturant() ;
		r.resturantChoiceList();
		
		Scanner sc = new Scanner(System.in);
		int resturantChoice = sc.nextInt();
		Menu m = new Menu();
		if(resturantChoice==1)
			{
				
				OrderBillWrite obw = new OrderBillWrite();
				obw.writeInFile("~~~~~~~~~~~~~~~~~~~~~~~~~");
				obw.writeInFile("Order Details");
				obw.writeInFile("Bhai Bhai Fastfood");
				m.BhaiMenu();
				
			}
		else if (resturantChoice==2)
			{
				
				OrderBillWrite obw = new OrderBillWrite();
				obw.writeInFile("~~~~~~~~~~~~~~~~~~~~~~~~~");
				obw.writeInFile("Order Details");
				obw.writeInFile("Shokher Rannaghor");
				m.ShokherMenu();
			}
		else if (resturantChoice==3)
			{
				
				OrderBillWrite obw = new OrderBillWrite();
				obw.writeInFile("~~~~~~~~~~~~~~~~~~~~~~~~~");
				obw.writeInFile("Order Details");
				obw.writeInFile("Order's Up");
				m.OrderMenu();
			}
		else if (resturantChoice==4)
			{
				
				OrderBillWrite obw = new OrderBillWrite();
				obw.writeInFile("~~~~~~~~~~~~~~~~~~~~~~~~~");
				obw.writeInFile("Order Details");
				obw.writeInFile("Shimanto Obokash Resturant");
				m.SORMenu();
			}
		else 
		{
			System.out.println("Wrong choice of Resturant");
			break ;
		}
	
		
		
		System.out.println("Please Give Your Information to us");
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter Your Name: ");
		String name = sc1.nextLine();
		System.out.print("Enter Your Adress: ");
		String adress = sc1.nextLine();
		System.out.print("Enter Your Phone No: ");
		String phoneNo= sc1.nextLine();
		Info i =new Info(name, adress, phoneNo);
		i.thx();
		
		Payment p = new Payment() ;
		p.paymentOption();
	}
	catch(Exception e)
	{
		System.out.println("Exception have found: "+e);
		System.out.println("Please Enter the recommended values");
		System.out.println("Try again");
	}
	
	}
	}

		
}