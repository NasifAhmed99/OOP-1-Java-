public class Main

{

	public static void main(String arg[])
	
	{
		Book book = new Book("Boi ami pori na","Ochena Balok",100) ;
		
		Library library = new Library("Nasif", "Airport",book) ;
	
		library.show();
	}	
	
}