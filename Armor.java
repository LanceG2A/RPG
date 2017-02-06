
public class Armor extends Item{

	private int defense;		//field to hold armor's defense
	
	public Armor(String name, int weight, int d)			//constructor to set defense
	{														//super constructor called to set name and weight
		super(name, weight);
		this.defense = d;
	}
	
	public int getDefense()		//method returns defense of armor
	{
		return defense;
	}
	
	public String examine()		//calls the super class' (Item) examine method and adds extra info (defense)
	{
		return super.examine() + "Defense: " + defense;
	}
	
}
