import samplePackage.MySampleClass ;
import samplePackage.subSamplePackage.MySubSampleClass ;

public class Main
{
	public static void main(String arg[])
	{
		MySampleClass s1 = new MySampleClass() ;
		s1.helloWord() ;
		s1.info() ;
		
		MySubSampleClass sub1 = new MySubSampleClass() ;
		sub1.display() ;
		sub1.message() ;
	}
}