public class Rectangle extends Shape
{
    public Rectangle()
    {
 
    }
    public Rectangle(double height, double width)
    {
        super(height, width);
    }
	public void draw() 
	{
		System.out.println(" Draw a Rectangle ") ;
	}
    public void calculateArea()
    {
       double area ;
	   area = height*width ;
    }
	public void show() 
	{
		System.out.println( " Height of Rectangle " +getHeight()) ;
		System.out.println( " Width of Rectangle " +getWidth()) ;
		System.out.println( " Area of Rectangle " +height*width) ;
	}
 
}