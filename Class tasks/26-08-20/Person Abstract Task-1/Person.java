public abstract class Person
{
	private String name ;
    private int age ;
    protected String phoneNo ;
    protected String email ;
    protected boolean occupation ;
	
	public Person(String name, int age, String phoneNo, String email, boolean occupation)
	{
		this.name = name ;
		this.age = age ;
		this.phoneNo = phoneNo ;
		this.email = email ;
		this.occupation = occupation ;	
	}
    public void setName(String name)
	{
		this.name = name ;
	}
    public void setAge(int age)
	{
		this.age = age ;
	}
    public String getName()
	{
		return name ;
	}
    public int getAge()
	{
		return age ;
	}
    public void setPhoneNo(String PhoneNo)
	{
		this.phoneNo = phoneNo ;
	}
    public String getPhoneNo()
	{
		return phoneNo ;
	}
    public void setEmail(String email)
	{
		this.email = email ;
	}
    public String getEmail()
	{
		return email ;
	}
	public void setOccupation(boolean occupation)
	{
		this.occupation = occupation ;
	}
	public boolean getOccupation()
	{
		return occupation ;
	}
	abstract boolean hasOccupation() ;
	abstract public void display() ;
}