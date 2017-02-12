import java.util.Scanner;

public class Demo {
	
	int weight;			
	String name;
	int bonusDamage;
	int bonusDefense;
	int bonusHealth;
	int nutrition;
	int quantity;
	int weapon;
	int armor;
	int speed;
	int totalWeight;
	
	//food
	int veggies = -10;		//food weight and nutrition values are equal
	int apple = 10;
	int banana = 15;
	int cheeseburger = 20;
	int pizza = 25;
	int heavenWrap = 40;
	
	
	
	
	final int mace = 30; 			//weapon fields 
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
				character.totalWeight += character.maceWeight;
				break;
				
		case 2: character.bonusDamage = character.sword;
				character.totalWeight += character.swordWeight;
				break;
				
		case 3: character.bonusDamage = character.longBow;
				character.totalWeight += character.longBowWeight;
				break;
				
		case 4: character.bonusDamage = character.boxingGloves;
				character.totalWeight += character.boxingGlovesWeight;
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
				character.totalWeight += (character.chainmailWeight + character.helmetWeight);
				break;
				
		case 2: character.bonusDefense = character.robes + character.fancyHat;
				character.totalWeight += (character.robesWeight + character.fancyHatWeight);
				break;
		}
		
		System.out.println("Now that you have a weapon and some armor, you can choose one of the three following blessings. "
				+ "The blessing of strength which will increase your damage.  The blessing of titans which will increase" + 
				"your defense.  And finally the blessing of wisdom which will increase your health");
		System.out.println("Enter the number corrseponding to the blessing of your choice"
				+ "\n1)Blessing of Strength\n2)Blessing of Titans\n3)Blessing of Wisdom");
		int blessing = keyboard.nextInt();
		switch(blessing)
		{
		case 1: character.bonusDamage = character.bonusDamage + 10;
				break;
				
		case 2: character.bonusDefense = character.bonusDefense + 10;
				break;
				
		case 3: character.bonusHealth = character.bonusHealth + 10;
				break;
		}
		
		int l = 0;
		while(l < 1)
		{
		
		System.out.println("Now you can choose what food to bring on your adventure.  Food restores health, " 
							+ "but it will slow you down.  Even after it has been consumed the weight will "
							+ "still affect you.  The more delicious, the more nutritious... At least "
							+ "that's what I tell myself.");
		System.out.println("So tell me, what would you like to bring?"
							+ "\n1)Fresh Veggies(-10)" + "\n2)Apples(10)" + "\n3)Bananas(15)"
							+ "\n4)Cheeseburgers(20)" + "\n5)Pizza(25)" + "\n6)Heaven Wrap(40)" + "\n7)Nothing(0)"
							+ "\nThe number after each food choice is the amount of health it restores as well as it's weight"
							+ "\n(Enter the number of your choice)");
		
		int foodChoice = keyboard.nextInt();
		if(foodChoice >= 1 && foodChoice <= 7)
		{
		
		switch(foodChoice)
		{
		case 1: character.totalWeight += -10;
				break;
		case 2: character.totalWeight += 10;
				break;
		case 3: character.totalWeight += 15;
				break;
		case 4: character.totalWeight += 20;
				break;
		case 5: character.totalWeight += 25;
				break;
		case 6: character.totalWeight += 40;
				break;
		case 7: character.totalWeight += 0;
				break;
		}
		l++; // incrementing l to stop the while loop from running
		}
		else
		{
			System.out.println("Please enter a valid number");// l is not incremented so the question
		}														//will be asked again
		
		}
		
		Player player1 = new Player(character.name, character.bonusDamage, character.bonusDefense, character.bonusHealth, character.totalWeight);
		
		System.out.println("Based on your choices you have the following stats: "
							+ player1.getPlayerStats());
		
						
		keyboard.close();		
		
	}

}
