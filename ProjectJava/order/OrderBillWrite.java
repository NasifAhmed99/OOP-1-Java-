package order;
import java.io.*;

public class OrderBillWrite 
{
	private File file;
	private FileWriter writer;
	private FileReader reader;
	
	public void writeInFile(String s) 
	{
		try 
		{
			file = new File("DetailsFileOfOrder.txt");
			file.createNewFile();
			writer = new FileWriter(file, true);
			writer.write(s + "\r" + "\n");
			writer.flush();
			writer.close();
		}
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
		}
	}
}