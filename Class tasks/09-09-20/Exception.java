import java.io.*;
public class Exception
{
   public static void main(String args[])
   {
      try 
	  {
        int a[] = new int[6];
		a[0] = 100;  
		a[1] = 200; 
		a[2] = 300; 
		a[3] = 400; 
		a[4] = 500;
        a[5] = 600;	
		System.out.println("a[0] = 100, a[1] = 200, a[2] = 300, a[4] = 500, a[5] = 600");
        System.out.println("Element is :" + a[6]);
      } 
	  catch (ArrayIndexOutOfBoundsException e) 
	  {
         System.out.println("Exception thrown  :" + e);
      }
   }
}