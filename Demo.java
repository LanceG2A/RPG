import java.util.Scanner;

public class Demo {
	
	int weight;			
	String name;
	int bonusDamage;
	int bonusDefense;
	int nutrition;
	int quantity;
	int weapon;
	int armor;
	
	
	final int mace = 30; 				//weapon fields 
	final int sword = 25;
	final int longBow = 20;
	final int boxingGloves = 10;
	
	final int maceWeight = 20;		//weapon weight
	final int swordWeight = 15;
	final int longBowWeight = 10;
	final int boxingGlovesWeight = 5;
	
	final int chainmail = 28;		//armor fields
	final int helmet = 17;
	final int robes = 9;
	final int fancyHat = 1;
	
	final int chainmailWeight = 50;	//armor weight
	final int helmetWeight = 30;
	final int robesWeight = 9;
	final int fancyHatWeight = 1;
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Demo character = new Demo();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello! What is your name?");
		character.name = keyboard.next();
		
		int j = 1;
		while(j < 2)
		{
		System.out.println("Choose your weapon! Enter the number of your choice:"
				+ "\n(1)Mace" + "\n" + "\tDamage: 30" + "\n" + "\tWeight: 20" + "\n(2)Sword" 
				+ "\n" + "\tDamage: 25"+ "\n" + "\tWeight: 15" +"\n(3)Long Bow" + "\n" + "\tDamage: 20" 
				+ "\n" + "\tWeight: 10" 
				+ "\n(4)Punching Gloves" + "\n" + "\tDamage: 10" + "\n" + "\tWeight: 5"
				+ "\nDamage increases the damage your character and weight affects your character's speed");
		
		
		character.weapon = keyboard.nextInt();
		if(character.weapon > 0 & character.weapon < 5)
			j++;
		else
			System.out.println("Invalid entery. Please enter 1, 2, 3, or 4.");
		}
		
		switch(character.weapon)
		{
		
		case 1: character.bonusDamage = character.mace;
				break;
				
		case 2: character.bonusDamage = character.sword;
				break;
				
		case 3: character.bonusDamage = character.longBow;
				break;
				
		case 4: character.bonusDamage = character.boxingGloves;
				break;
		}
		
		int i = 1;
		while(i < 2)
		{
		
		System.out.println("Choose your armor!  Enter the number of your choice: "
							+ "\n(1)Chainmail and Helmet" + "\n" + "\tArmor: 45" + "\n" + "\tWeight: 80"
							+ "\n(2)Cozy Robes and a Fancy Hat" + "\n" + "\tArmor: 10" + "\n\tWeight: 10"
							+ "\nArmor reduces damage your character takes and heavier items cause your character to be slower." 
							+  "Choose wisely!");
		
			character.armor = keyboard.nextInt();
			if(character.armor > 0 & character.armor < 5)
				i++;
			else
				System.out.println("Invlad entry. Please enter 1, or 2.");
		}
		switch(character.armor)
		{
		
		case 1: character.bonusDefense = character.chainmail + character.helmet;
				break;
				
		case 2: character.bonusDefense = character.robes + character.fancyHat;
				break;
		}
		
		Player Player1 = new Player(character.name, character.bonusDamage, character.bonusDefense);
		
		
		
		
		
	}

}
