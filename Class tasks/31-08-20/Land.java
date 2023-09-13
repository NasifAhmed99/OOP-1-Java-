public class Land implements ITree
{
    public int length ;
	public Land()
	{
	
	}
	public Land(int length)
	{
	   this.length = length ;
	}
	public void calculateArea()
	{
	  int area = length*length ;
	  System.out.println("AreaOfLand: " + area) ;
	}
	
	public void canPlant()
	{
	  System.out.println("Plant mango trees") ;
	}
}