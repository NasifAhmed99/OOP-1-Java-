public class Faculty extends Employee
{
	protected String officeRoomNo ;
    public String Email ;
	
	public Faculty ()
	{
	}
    public Faculty ( String officeRoomNo, String Email )
    {
		this.officeRoomNo = officeRoomNo ;
		this.Email = Email ;
	}
	public void setofficeRoomNo ( String OfficeRoomNo )
	{
		this.officeRoomNo = officeRoomNo ;
	}
	public String getofficeRoomNo ()
	{
		return officeRoomNo ;
	}
	public void canTakeClass ()
	{
		System.out.println (" Faculty can take class " ) ;
	}
	public void show () 
	{
		System.out.println ( "Faculty office room no : "+getofficeRoomNo () ) ;
		System.out.println ( "Faculty Email is : "+this.Email ) ;
	}
}