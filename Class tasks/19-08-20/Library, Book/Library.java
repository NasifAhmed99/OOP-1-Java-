 public class Library

{
	
	public Book book ;
	public String name ;
	public String address ;  
	
	
	public Library()
	{
		
	}
	public Library( String name, String address , Book book)
	{
		this.name = name ;
		this.address = address ;
		this.book = book ;
	}
	
	
	public void setBook(Book book)
	{
		this.book = book ;
	}
	public void setName(String name)
	{
		this.name = name ;
		
	}
	public String getName()
	{
		return this.name;
		
	}
	
	public void setAddress(String address)
	{
		this.address = address ;
		
	}
	public String getAddress()
	{
		return this.address;
		
	}
	
	
	public void show()
	{
		System.out.println("Name: "+name) ;	
		System.out.println("Address: "+address) ;				
		System.out.println("Book Name: "+book.getBookName()+ " Author Name : "+ book.getAuthorName()+ " Number of copy :"+ book.getNoOfCopy()) ;
	}		
}