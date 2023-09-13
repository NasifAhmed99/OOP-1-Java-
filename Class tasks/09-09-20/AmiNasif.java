import java.io.*; 
class AmiNasif 
{ 
    public static void main (String[] args) 
    { 
        String a = null; 
        try
        { 
            if (a.equals("AmiNasif")) 
			
                System.out.print("Same"); 
           
		    else 
			    System.out.print("Not Same"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.print("NullPointerException Caught"); 
        } 
    } 
}