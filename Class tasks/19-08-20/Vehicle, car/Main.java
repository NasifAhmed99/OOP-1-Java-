public class Main
{
	public static void main ( String arg[])
	{
		Vehicle v1 = new Vehicle ();
		v1.canBreak () ;
		v1.canAccelarate () ;
		v1.canStart () ;
		Car c1 = new Car () ;
		Car c2 = new Car (40,"Super Car",4,4,"Str GT-2","Supra","Dhaka metro KO") ;
		c2.show ();
	}
}
	