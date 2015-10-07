
public class TestPayroll {

	public static void main(String[] args) {
		
		try{
			Payroll worker = new Payroll("abc", -123);
		}
		
		catch(BlankNameException | NegativeEmployeeId e){
			System.out.println(e.getMessage());
		}
		
		try{
			Payroll worker = new Payroll("", 123);
		}
		
		catch(BlankNameException | NegativeEmployeeId e){
			System.out.println(e.getMessage());
		}
	}

}
