public class Vehicle
{
	protected int WheelNumber ; 
    protected String TypeOfVehicles ;
    protected int NumberOfDoors ;
    protected int NumberOfWindows ;
	
	public Vehicle()
	{
		System.out.println("Empty constructor");
	}
	public Vehicle(int WheelNumber, String TypeOfVehicles, int NumberOfDoors, int NumberOfWindows)
	{
		this.WheelNumber = WheelNumber ;
		this.TypeOfVehicles = TypeOfVehicles ;
		this.NumberOfDoors = NumberOfDoors ;
		this.NumberOfWindows = NumberOfWindows ;
	}
	public void setWheelNumber ( int WheelNumber )
	{
		this.WheelNumber = WheelNumber ;
	}
	public void setTypeOfVehicles ( String TypeOfVehicles )
	{
		this.TypeOfVehicles = TypeOfVehicles ;
	}
	public void setNumberOfDoors ( int NumberOfDoors)
	{
		this.NumberOfDoors = NumberOfDoors ;
	}
	public void setNumberOfWindows( int NumberOfWindows )
	{
		this.NumberOfWindows = NumberOfWindows ;
	}
	public int getWheelNumber ()
	{
		return WheelNumber ;
	}
	public String getTypeOfVehicles ()
	{
		return TypeOfVehicles ;
	}
	public int getNumberOfDoors ()
	{
		return NumberOfDoors ;
	}
	public int getNumberOfWindows ()
	{
		return NumberOfWindows ;
	}
	
	public void canBreak()
	{
		System.out.println(" Break the car") ;
	}
    public void canAccelarate()
	{
		System.out.println(" Accelarate the car") ; 
	}
    public void canStart()
	{
		System.out.println(" start the car ") ;
	}
}