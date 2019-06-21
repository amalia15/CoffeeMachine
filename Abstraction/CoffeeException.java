package Abstraction;

public class CoffeeException extends Exception {
	
	public CoffeeException(){
		super();
	}
	
	public CoffeeException(String message, Throwable cause,
			boolean enableSuppression, boolean writeableStackTrace){
		super(message, cause, enableSuppression, writeableStackTrace);
	}
	
	public CoffeeException(String message, Throwable cause){
		super(message, cause);
	}
	
	public CoffeeException(String message){
		super(message);
	}
	
	public CoffeeException(Throwable cause){
		super(cause);
	}
	
}
