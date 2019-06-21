package Abstraction;

public class Coffee {
	private CoffeeSelection selection;
	private double quantity;
	
	public Coffee (CoffeeSelection selection, double quantity) {
		this.selection = selection;
		this.quantity = quantity;
	}
	
	//getter method - returns coffee selection
	public CoffeeSelection getSelection(){
		return selection;
	}
	
	//getter method - returns quantity
	public double getQuantity(){
		return quantity;
	}
	
	//setter method - set the value of quantity
	public void setQuantity(double quantity){
		this.quantity = quantity;
	}
}
