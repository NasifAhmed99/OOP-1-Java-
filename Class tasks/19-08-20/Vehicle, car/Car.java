public class Car extends Vehicle
{
	private String engineNumber ;
	public String vehicleName ;
	private String plateNumber ;
	
	public Car ()
	{
		 System.out.println("Empty constructor");
	}
	public Car (int WheelNumber,String TypeOfVehicles,int NumberOfDoors,int NumberOfWindows, String engineNumber, String vehiclename, String plateNumber )
	{
		super(WheelNumber, TypeOfVehicles, NumberOfDoors, NumberOfWindows);
		this.engineNumber = engineNumber ;
		this.vehicleName = vehicleName ;
		this.plateNumber = plateNumber ;
	}
	public void setengineNumber ( String engineNumber )
	{
		this.engineNumber = engineNumber ;
	}
	public String getengineNumber ()
	{
		return engineNumber ;
	}
	public void setplateNumber ( String plateNumber )
	{
		this.plateNumber = plateNumber ;
	}
	public String getplateNumber ()
	{
		return plateNumber ;
	}
	public void show ()
	{
	    System.out.println("Wheel Number  : " +getWheelNumber());
        System.out.println("Type Of Vehcle  : " +getTypeOfVehicles());
        System.out.println("Number Of Dorss  : " +getNumberOfDoors());
        System.out.println("Number Of Windows   : " +getNumberOfWindows());
        System.out.println("Engine Number  : " +getengineNumber());
        System.out.println("Vehicle Name  : " +vehicleName);
        System.out.println("Plate Number  : " +getplateNumber());
    }
}