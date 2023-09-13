package information;
import order.*;
import java.util.Scanner;
public class Info
{
	public String name;
	public String adress;
	public String phoneNo;
	
	public Info(String name, String adress, String phoneNo)
	{
		this.name = name ;
		this.adress = adress ;
		this.phoneNo = phoneNo ;
		
	}
	public void thx()
	{
		System.out.println("Thanks For giving information");
		OrderBillWrite obw = new OrderBillWrite();
		obw.writeInFile("Name : " +name);
		obw.writeInFile("Adress : " + adress);
		obw.writeInFile("Phone No : " + phoneNo);
		
	}

}