package welcome;
public interface IWelcome
{
	public static void intro()
	{
		System.out.println("*******************************");
		System.out.println("Welcome To PN_Food_Survice");
		System.out.println("Developed By :");
		System.out.println("Protik Acharjay ID:20-42715-1");
		System.out.println("& Nasif Ahmed ID:20-42403-1");
		System.out.println("We surve quality to satisfy");
		System.out.println("*******************************");
	}
	
	public abstract void resturantChoiceList() ;
}