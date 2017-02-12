

public class Player {
	
	String name;       //player name
	int health = 100;  //health value of player
	int damage = 3;		//base damage with no bonuses is 3
	int armor = 5;		//base defense is 5
	int weight = 0;
	int speed;
	
	public Player(String name, int bonusDamage, int bonusDefense, int bonusHealth, int weight)
	{
		this.name = name;
		this.damage = this.damage + bonusDamage;
		this.armor = this.armor + bonusDefense;
		this.health = this.health + bonusHealth;
		this.weight += weight;
		
		if(this.weight <= 30)			//these if and else if statements
		{								//set the players speed based on
			this.speed = 50; 			//the weight of the items they chose
		}
		else if(this.weight > 30 && this.weight <= 40)
		{
			this.speed = 35;
		}
		else if(this.weight > 40 && this.weight <= 50)
		{
			this.speed = 20;
		}
		else if(this.weight > 50)
		{
			this.speed = 5;
		}
		
	}
	

	
	
	
	public String getPlayerStats()
	{
		return "Name: " + this.name + "\nHealth: " + this.health 
				+ "\nDamage; " + this.damage + "\nArmor: " + this.armor
				+ "\nWeight: " + this.weight + "\nSpeed: " + this.speed;
	}
	
	
}
