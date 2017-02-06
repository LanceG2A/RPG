
public class Food extends Item {
	
	private int nutrition = 0;
	private int quantity = 0;
	
	public Food(String name, int weight, int nutrition) // constructor calls super class first 
	{
		super(name, weight);
		this.nutrition = nutrition;
	}
	

	public int getNutrition()		//getter method for nutrition
	{
		return nutrition;
	}
	
	public int getQuantity()		//getter method for quantity
	{
		return quantity;
	}
	
	public void setQuantity(int newQuantity) //setter method for quantity
	{
		this.quantity = newQuantity;
	}

	public String examine()		//returns super class info and food information
	{							
		return super.examine() + "Nutrition: " + nutrition + "\n"
								+ "Qantity: " + quantity + "\n";
	}
}