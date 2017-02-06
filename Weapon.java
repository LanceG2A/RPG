
public class Weapon extends Item {
	
	private int damage = 0;			//To hold the item damage
	
	public Weapon(String name, int weight, int d)			//constructor to set the damage
	{
		super(name, weight);
		this.damage = d;
	}

	
	public int getDamage()     //method to return damage
	{
		return damage;
	}
	
	public String examine()  //calls super class examine method then adds damage info
	{
		return super.examine() + "Damage: " + damage;
	}


}
