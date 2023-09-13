public class Employee
{
	public String name;
	public String id;
	private EmpSalary Salary ;
	private String phoneNo;
	public String email;
	
	public Employee()
	{
		
	}
	public Employee(String name, String id, String email)
	{
		this.name = name ;
		this.id = id ;
		this.email = email ;
	}
	
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo ;
	}
	public String getPhoneNo()
	{
		return this.phoneNo ;
	}
	public void setSalary(EmpSalary Salary)
	{
		this.Salary = Salary ;
	}
	public EmpSalary getSalary()
	{
		return Salary ;
	}
	
	
	
	public void show()
	{
		System.out.println("Employee Name: "+ name) ;
		System.out.println("Employee ID: "+ id) ;
		System.out.println("Employee Basic Amount: " + getSalary() ) ;
		System.out.println("Employee Phone No: "+ phoneNo) ;
		System.out.println("Employee Email: "+ email) ;
	}
}
