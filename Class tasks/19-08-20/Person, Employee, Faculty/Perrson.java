public class Person
{
	public String name ;
	private int age ;
	public String bloodGroup ;
	
	public Person ()
	{
		 
	}
	public Person ( String name,int age,String bloodGroup )
	{
		this.name = name ;
		this.age = age ;
		this.bloodGroup = bloodGroup ;
	}
	public void setage ( int age )
	{
		this.age = age ;
	}
	public int getage() 
	{
		return age ;
	}
	public void show ()
	{
		System.out.println("Person Name is : " +this.name) ;
	    System.out.println("person Age is : " +getage()+ " Years Old") ;
        System.out.println("Person Blood Group is : " +this.bloodGroup) ;
	}
}
