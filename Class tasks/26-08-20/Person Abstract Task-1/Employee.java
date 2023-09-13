public class Employee extends Person
{
	private String id ;
    private int salary ;
	
	public Employee(String name, int age, String phoneNo, String email, boolean occupation, String id, int salary)
	{
		super(name, age, phoneNo, email, occupation) ;
		this.id = id ;
		this.salary = salary ;
	}
    public void setID(String id)
	{
		this.id = id ;
	}
    public void setSalary(int salary)
	{
		this.salary = salary ;
	}
    public String getId()
	{
		return id ;
	}
    public int getSalary()
	{
		return salary ;
	}
	public boolean hasOccupation() 
	{
		System.out.println(" Employee has occupation ") ;
		return occupation ;
	}
	public void display() 
	{
		System.out.println(" Name of the employee is : " + getName()) ;
		System.out.println(" Age of the employee is : " + getAge()) ;
		System.out.println(" Phone number of employee is : " + getPhoneNo()) ;
		System.out.println(" Email of employee is : " + getEmail()) ;
		System.out.println(" Occupation of employee is : " + getOccupation()) ;
		System.out.println(" ID of employee is : " + getId()) ;
		System.out.println(" Salary of employee is : " + getSalary()) ;
	}
	
}
