public class Student extends Person
{
	private String id ;
    private double cgpa ;
	
	public Student(String name, int age, String phoneNo, String email, boolean occupation, String id, double cgpa)
	{
		super(name, age, phoneNo, email, occupation) ;
		this.id = id ;
		this.cgpa = cgpa ;
	}
    public void setId(String id)
	{
		this.id = id ;
	}
    public void setCgpa(double cgpa)
	{
		this.cgpa = cgpa ;
	}
    public String getId()
	{
		return id ;
	}
    public double getCgpa()
	{
		return cgpa ;
	}
	public boolean hasOccupation() 
	{
		System.out.println(" Student has no occupation ") ;
		return occupation ;
	}
	public void display() 
	{
		System.out.println(" Name of the student is : " + getName()) ;
		System.out.println(" Age of the student is : " + getAge()) ;
		System.out.println(" Phone number of student is : " + getPhoneNo()) ;
		System.out.println(" Email of student is : " + getEmail()) ;
		System.out.println(" Occupation of student is : " + getOccupation()) ;
		System.out.println(" ID of Student is : " + getId()) ;
		System.out.println(" CGPA of student is : " + getCgpa()) ;
	}
}