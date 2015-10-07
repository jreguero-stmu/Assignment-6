
public class PayRateException extends Exception{
	
	public PayRateException(){
		super("Error: invalid pay rate. Must be between 0 and 25");
	}
	
	
	public PayRateException(double pay){
		super("Error: invalid pay rate:" + pay + "\nMust be between 0 and 25");
	}

}
