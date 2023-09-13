package welcome;
import java.util.Scanner;
public class Resturant implements IWelcome
{
	public int resturantChoice;
	public void setresturantChoice(int resturantChoice)
	{
		this.resturantChoice = resturantChoice ;
	}
	public double getresturantChoice()
	{
		return resturantChoice ;
	}
	
	public void resturantChoiceList()
	{
		System.out.println("Choice A Resturant to Order:");
		System.out.println("1.Bhai Bhai Fastfood");
		System.out.println("2.Shokher Rannaghor");
		System.out.println("3.Order's Up");
		System.out.println("4.Shimanto Obokash Resturant");
		
		
		
	}
	
}