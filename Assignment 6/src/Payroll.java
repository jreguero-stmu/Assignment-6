
public class Payroll {
	
	private String empName;
	private int empID;
	private double payRate;
	private double hrsWorked;
	
	
	public Payroll(String empName, int empID) throws BlankNameException, NegativeEmployeeId{
		super();
		if(empName != "" && empID >= 0){
			this.empName = empName;
			this.empID = empID;
		}
		if(empName == ""){
			throw new BlankNameException();
		}
		if(empID < 0){
			throw new NegativeEmployeeId();
		}
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) throws BlankNameException {
		if(empName != ""){
			this.empName = empName;
		}
		else{
			throw new BlankNameException();
		}
	}


	public int getEmpID() {
		return empID;
	}


	public void setEmpID(int empID) throws NegativeEmployeeId{
		if(empID >= 0){
			this.empID = empID;
		}
		else{
			throw new NegativeEmployeeId();
		}
	}


	public double getPayRate() {
		return payRate;
	}

	
	public void setPayRate(double payRate) throws PayRateException{
		if(payRate > 0 && payRate < 25){
			this.payRate = payRate;
		}
		else{
			throw new PayRateException();
		}
	}


	public double getHrsWorked() {
		return hrsWorked;
	}


	public void setHrsWorked(double hrsWorked) throws HrsWorkedException{
		if(hrsWorked > 0 && hrsWorked < 84){
			this.hrsWorked = hrsWorked;
		}
		else{
			throw new HrsWorkedException();
		}
	}
	
	
	public double getGrossPay(){
		return getHrsWorked() * getPayRate();
	}

}
