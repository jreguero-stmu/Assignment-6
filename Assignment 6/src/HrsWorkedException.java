
public class HrsWorkedException extends Exception{
	
	public HrsWorkedException(){
		super("Error: hours worked is invalid");
	}
	
	
	public HrsWorkedException(double hrs){
		super("Error: hours worked must be between 0 and 84: " + hrs);
	}

}
