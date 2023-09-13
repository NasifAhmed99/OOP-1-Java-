package order;
import welcome.*;
import java.util.Scanner;
public class Menu extends Resturant
{
	int choice,again,sum=0;
	int resturantChoice;
	
	
	public void BhaiMenu()
	{
		
		while(true)
		{
		System.out.println("Welcome To Bhai Bhai Fastfood");
		System.out.println("Choice An Item to Order:");
		System.out.println("1.Burger - 200tk");
		System.out.println("2.Pizza - 250tk");
		System.out.println("3.Chicken Fry - 150tk");
		System.out.println("4.Set Menu for one person - 199tk");
		System.out.println("5.Drinks - 26tk");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1)
		{
			sum=sum+200;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Burger - 200tk");
			
		}
		else if(choice==2)
		{
			sum=sum+250;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Pizza - 250tk");
		}
		else if(choice==3)
		{
			sum=sum+150;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Chicken Fry - 150tk");
		}
		else if(choice==4)
		{
			sum=sum+199;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Set Menu for one person - 199tk");
		}
		else if(choice==5)
		{
			sum=sum+26;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Drinks - 26tk");
		}
		else 
		{
			System.out.println("Wrong choice of Food");
			continue ;
		}
		System.out.println("Do You Want TO Order Again/More??");
		System.out.println("Press 1 for order again/more");
		System.out.println("Press 2 for finish the ordering");
		int again = sc.nextInt();
		if(again==1)
		{
			continue;
		}
		else 
		{
			break;
		}
		}
		System.out.println("Total Amount : " +sum);
		OrderBillWrite obw = new OrderBillWrite();
		
		obw.writeInFile("Total Amount : " +sum);
	}
	
	public void ShokherMenu()
	{
		while(true)
		{
		System.out.println("Welcome To Shokher Rannaghor");
		System.out.println("Choice An Item to Order:");
		System.out.println("1.Burger - 150tk");
		System.out.println("2.Pizza - 200tk");
		System.out.println("3.Chicken Fry - 120tk");
		System.out.println("4.Set Menu for one person - 170tk");
		System.out.println("5.Drinks - 20tk");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1)
		{
			sum=sum+150;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Burger - 150tk");
		}
		else if(choice==2)
		{
			sum=sum+200;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Pizza - 200tk");
		}
		else if(choice==3)
		{
			sum=sum+120;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Chicken Fry - 120tk");
		}
		else if(choice==4)
		{
			sum=sum+170;
			OrderBillWrite obw = new OrderBillWrite();
		
			obw.writeInFile("Set Menu for one person - 170tk");
		}
		else if(choice==5)
		{
			sum=sum+20;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Drinks - 20tk");
		}
		else 
		{
			System.out.println("Wrong choice of Food");
			continue ;
		}
		
		System.out.println("Do You Want TO Order Again/More??");
		System.out.println("Press 1 for order again/more");
		System.out.println("Press 2 for finish the ordering");
		int again = sc.nextInt();
		if(again==1)
		{
			continue;
		}
		else 
		{
			break;
		}
		}
		System.out.println("Total Amount : " +sum);
		OrderBillWrite obw = new OrderBillWrite();
		
		obw.writeInFile("Total Amount : " +sum);
	}
	public void OrderMenu()
	{
		while(true)
		{
		System.out.println("Welcome To Order's Up");
		System.out.println("Choice An Item to Order:");
		System.out.println("1.Burger - 180tk");
		System.out.println("2.Pizza - 220tk");
		System.out.println("3.Coffee - 80tk");
		System.out.println("4.French Fries - 100tk");
		System.out.println("5.Drinks - 25tk");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1)
		{
			sum=sum+180;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Burger - 180tk");
		}
		else if(choice==2)
		{
			sum=sum+220;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Pizza - 220tk");
		}
		else if(choice==3)
		{
			sum=sum+80;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Coffee - 80tk");
		}
		else if(choice==4)
		{
			sum=sum+100;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("French Fries - 100tk");
		}
		else if(choice==5)
		{
			sum=sum+25;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Drinks - 25tk");
		}
		else 
		{
			System.out.println("Wrong choice of Food");
			continue ;
		}
		
		System.out.println("Do You Want TO Order Again/More??");
		System.out.println("Press 1 for order again/more");
		System.out.println("Press 2 for finish the ordering");
		int again = sc.nextInt();
		if(again==1)
		{
			continue;
		}
		else 
		{
			break;
		}
		}
		System.out.println("Total Amount : " +sum);
		OrderBillWrite obw = new OrderBillWrite();
		
		obw.writeInFile("Total Amount : " +sum);
		
	}
	
	public void SORMenu()
	{
		while(true)
		{
		System.out.println("Welcome To Shimanto Obokash Resturant");
		System.out.println("Choice An Item to Order:");
		System.out.println("1.Khichuri - 140tk");
		System.out.println("2.Biriani - 280tk");
		System.out.println("3.Coffee - 60tk");
		System.out.println("4.French Fries - 80tk");
		System.out.println("5.Drinks - 25tk");
		
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		if(choice==1)
		{
			sum=sum+140;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Khichuri - 140tk");
		}
		else if(choice==2)
		{
			sum=sum+280;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Biriani - 280tk");
		}
		else if(choice==3)
		{
			sum=sum+60;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Coffee - 60tk");
		}
		else if(choice==4)
		{
			sum=sum+80;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("French Fries - 80tk");
		}
		else if(choice==5)
		{
			sum=sum+25;
			OrderBillWrite obw = new OrderBillWrite();
			
			obw.writeInFile("Drinks - 25tk");
		}
		else 
		{
			System.out.println("Wrong choice of Food");
			continue ;
		}
		
		System.out.println("Do You Want TO Order Again/More??");
		System.out.println("Press 1 for order again/more");
		System.out.println("Press 2 for finish the ordering");
		int again = sc.nextInt();
		if(again==1)
		{
			continue;
		}
		else 
		{
			break;
		}
		}
		System.out.println("Total Amount : " +sum);
		OrderBillWrite obw = new OrderBillWrite();
		
		obw.writeInFile("Total Amount : " +sum);
		
		
	}
}