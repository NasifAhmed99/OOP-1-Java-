public class EmpSalary 
{
	private double basicAmout ;
    private double festivalBonus ;
    private double overtimeAmount ;
	
	public EmpSalary()
	{
		
	}
	private EmpSalary(double basicAmout, double festivalBonus, double overtimeAmount)
	{
		this.basicAmout = basicAmout ;
		this.festivalBonus = festivalBonus ;
		this.overtimeAmount = overtimeAmount ;
	}
	void setBasicAmount(double basicAmout)
	{
		this.basicAmout = basicAmout ;
	}
	double getBasicAmout()
	{
		return basicAmout ;
	}
	void setFestivalBonus(double festivalBonus)
	{
		this.festivalBonus = festivalBonus ;
	}
	double getFestivalBonus()
	{
		return festivalBonus ;
	}
	void setOvertimeAmount(double overtimeAmount)
	{
		this.overtimeAmount = overtimeAmount ;
	}
	double getOvertimeAmount()
	{
		return overtimeAmount ;
	}
	
}