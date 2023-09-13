public class EmployeeMain
{
	public static void main(String arg[])
	{
		EmpSalary empSalary = new EmpSalary() ;
		
		empSalary.setBasicAmount(2000.69) ;
		empSalary.setFestivalBonus(1000.70) ;
		empSalary.setOvertimeAmount(500.10) ;
		
		Employee employee = new Employee("Nasif", "20-42403-1", "ahmednasif42403@gmail.com") ;
		
		employee.setPhoneNo("0163xxxxxxx") ;
		employee.setSalary(empSalary) ;
		
		employee.show() ;
	}
}