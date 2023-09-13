public class Start
{
	public static void main (String arg[])
	{
		Student s1 = new Student ("Nasif", 20, "01631-XXXXXX", "ahmednasif42403@gmail.com", false, "20-42403-1", 4.00) ;
		s1.hasOccupation() ;
		s1.display() ;
		
		Employee e1 = new Employee ("Fahmida Alam", 26, "01416-XXXXXX", "fahmida@aiub.edu", true, "1800-47-7366", 100000) ;
		e1.hasOccupation() ;
		e1.display() ;
	}
}