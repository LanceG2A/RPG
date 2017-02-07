

public class Player {
	
	private String name;       //player name
	private int health = 100;  //health value of player
	private int damage = 3;		//base damage with no bonuses is 3
	private int armor = 5;		//base defense is 5
	
	
	public Player(String name, int bonusDamage, int bonusDefense)
	{
		this.name = name;
		this.damage = this.damage + bonusDamage;
		this.armor = this.armor + bonusDefense;
		this.health = this.health; 
		
	}
	
	public String getPlayerStats()
	{
		return "Name: " + this.name + "\nHealth: " + this.health 
				+ "\nDamage; " + this.damage + "\nArmor: " + this.armor;
	}
	
	
}
