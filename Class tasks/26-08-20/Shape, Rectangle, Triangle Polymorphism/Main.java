public class Main
{
    public static void main(String args[]) 
    {
        Shape s1 = new Rectangle() ;
		s1.setHeight(6.69) ;
		s1.setWidth(4.44) ;
		s1.draw() ;
        s1.calculateArea() ;
		s1.show() ;
 
        Shape s2 = new Triangle() ;
		s2.setHeight(7.69) ;
		s2.setWidth(5.00f) ;
		s2.draw() ;
        s2.calculateArea() ; 
		s2.show() ;
    }
}