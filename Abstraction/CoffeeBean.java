package Abstraction;

public class CoffeeBean {

	private String name;
	
	private double quantity;
	
	public CoffeeBean(String name, double quantity){
		this.name = name;
		this.quantity = quantity;
	}
	
	//getter method - gets name of CoffeeBean
	public String getName(){
		return name;
	}
	
	//setter method - sets the name of CoffeeBean
	public void setName(String name){
		this.name = name;
	}
	
	//getter method - gets the quanity of CoffeeBean
	public double getQuantity(){
		return quantity;
	}
	
	//setter method - sets the quantity of CoffeeBean
	public void setQuantity(double quantity){
		this.quantity = quantity;
	}
	
}
