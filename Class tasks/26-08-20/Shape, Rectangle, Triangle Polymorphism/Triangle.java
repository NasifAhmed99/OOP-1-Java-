public class Triangle extends Shape
{
    public Triangle()
    {
 
    }
    public Triangle(double height, double width)
    {
        super(height, width);
    } 
	public void draw() 
	{
		System.out.println(" Draw a Triangle ") ;
	}
    public void calculateArea()
    {
      double area ;
	  area = 0.5*height*width ;
    }
	public void show() 
	{
		System.out.println( " Height of Triangle " +getHeight()) ;
		System.out.println( " Width of Triangle " +getWidth()) ;
		System.out.println( " Area of Triangle " +0.5*height*width) ;
	}
 
}