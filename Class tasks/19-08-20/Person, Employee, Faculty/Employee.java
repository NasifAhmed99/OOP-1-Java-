public class Employee extends Person 
{
	protected String ID ;
    public String phoneNo ;
    public int yearOfExperience ;
    private float salary ;
	
	public Employee ()
	{
	
	}
	public Employee ( String ID, String phoneNo, int yearOfExperience, float salary )
	{
		this.ID = ID ;
		this.phoneNo = phoneNo ;
		this.yearOfExperience = yearOfExperience ;
		this.salary = salary ;
	}
	public void setID ( String ID )
	{
		this.ID = ID ;
	}
	public String getID ()
	{
		return ID ;
	}
	public void setsalary ( float salary ) 
	{
		this.salary = salary ;
	}
	public float getsalary ()
	{
		return salary ;
	}
	public void show ()
	{
		System.out.println("Employee ID is : "+getID());
        System.out.println("Employee phone No is : "+this.phoneNo);
        System.out.println("Employee year of experience is : "+this.yearOfExperience+" Years");
        System.out.println("Employee Salary  is : "+getsalary()+ " Taka ");
	}
}