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
	
	
	Weapon ouch;		//Weapon object	
	Armor clang;		//Armor object
	Armor clunk;		//second Armor object (two pieces of armor chosen)
	Food yum;			//Food object
				//These objects will be initialized using information
				//gained from the user
	
	
	public static void main(String[] args) {
		
		
		Demo character = new Demo();	//A new character is created to play the game
		Scanner keyboard = new Scanner(System.in);	//to allow user input
		
		System.out.println("Hello! What is your name?");	//extracting basic player information
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
		
		
		character.weapon = keyboard.nextInt();		// storing the user's weapon choice
		if(character.weapon > 0 & character.weapon < 5)
			j++;											//if statement to ensure valid entry
		else
			System.out.println("Invalid entery. Please enter 1, 2, 3, or 4.");
		}
		
		switch(character.weapon)
		{			//Character's damage and weight is adjusted based on weapon choice
					// Weapon object is initialized using the chosen weapon
		case 1: character.bonusDamage = character.mace;
				character.totalWeight += character.maceWeight;
				character.ouch = new Weapon("Mace", character.maceWeight, character.mace);
				break;
				
		case 2: character.bonusDamage = character.sword;
				character.totalWeight += character.swordWeight;
				character.ouch = new Weapon("Sword", character.swordWeight, character.sword);
				break;
				
		case 3: character.bonusDamage = character.longBow;
				character.totalWeight += character.longBowWeight;
				character.ouch = new Weapon("Long Bow", character.longBowWeight, character.longBow);
				break;
				
		case 4: character.bonusDamage = character.boxingGloves;
				character.totalWeight += character.boxingGlovesWeight;
				character.ouch = new Weapon("Boxing Gloves", character.boxingGlovesWeight, character.boxingGloves);
				break;
		}
		
		int i = 1;	
		while(i < 2)			//While statement used to ensure the user enters valid response
		{
		
		System.out.println("Choose your armor!  Enter the number of your choice: "
							+ "\n(1)Chainmail and Helmet" + "\n" + "\tArmor: 45" + "\n" + "\tWeight: 80"
							+ "\n(2)Cozy Robes and a Fancy Hat" + "\n" + "\tArmor: 10" + "\n\tWeight: 10"
							+ "\nArmor reduces damage your character takes and heavier items cause your character to be slower." 
							+  "Choose wisely!");
		
			character.armor = keyboard.nextInt();
			if(character.armor > 0 & character.armor < 5)	//This if statement ends the while loop if 
				i++;										//the user entered 1 through 5
			else
				System.out.println("Invlad entry. Please enter 1, or 2.");
		}
		switch(character.armor)		//Character's defense is adjusted based on armor choice.
		{							//2 Armor objects are initialized using the armor choices
		
		case 1: character.bonusDefense = character.chainmail + character.helmet;
				character.totalWeight += (character.chainmailWeight + character.helmetWeight);
				character.clang = new Armor("Chainmail", character.chainmailWeight, character.chainmail);
				character.clunk = new Armor("Helmet", character.helmetWeight, character.helmet);
				break;
				
		case 2: character.bonusDefense = character.robes + character.fancyHat;
				character.totalWeight += (character.robesWeight + character.fancyHatWeight);
				character.clang = new Armor("Robes", character.robesWeight, character.robes);
				character.clunk = new Armor("Fancy Hat", character.fancyHatWeight, character.fancyHat);
				break;
		}
		
		System.out.println("Now that you have a weapon and some armor, you can choose one of the three following blessings. " + "\n"
				+ "The blessing of strength which will increase your damage." +  "\nThe blessing of titans which will increase" + 
				"your defense." + "\nAnd finally the blessing of wisdom which will increase your health");
		System.out.println("Enter the number corrseponding to the blessing of your choice"
				+ "\n1)Blessing of Strength\n2)Blessing of Titans\n3)Blessing of Wisdom");
		int blessing = keyboard.nextInt();
		switch(blessing) 						//Character's damage, defense, or health is increased	
		{										//based on the chosen blessing
		case 1: character.bonusDamage = character.bonusDamage + 10;	//Switch statement is used for simplicity
				break;
				
		case 2: character.bonusDefense = character.bonusDefense + 10;
				break;
				
		case 3: character.bonusHealth = character.bonusHealth + 10;
				break;
		}
		
		int l = 0;
		while(l < 1)
		{					//While statement is used to ensure the user enters 
							//an appropriate response (i.e. a valid number)
		System.out.println("Now you can choose what food to bring on your adventure.  Food restores health, " 
							+ "but it will slow you down." + "\n" + "Even after it has been consumed the weight will "
							+ "still affect you.  The more delicious, the more nutritious..." + "\n" + "At least "
							+ "that's what I tell myself.");
		System.out.println("So tell me, what would you like to bring?"
							+ "\n1)Fresh Veggies(-10)" + "\n2)Apples(10)" + "\n3)Bananas(15)"
							+ "\n4)Cheeseburgers(20)" + "\n5)Pizza(25)" + "\n6)Heaven Wrap(40)" + "\n7)Nothing(0)"
							+ "\nThe number after each food choice is the amount of health it restores as well as it's weight"
							+ "\n(Enter the number of your choice)");
		
		int foodChoice = keyboard.nextInt();
		
		
		
		if(foodChoice >= 1 && foodChoice <= 7)
		{
		
		switch(foodChoice) //The character's weight is adjusted based on which food was chosen
		{					// a Food object is initialized with the name, weight and nutrition of the food
		case 1: character.totalWeight += -10;
				character.yum = new Food("Fresh Veggies", character.veggies, character.veggies);
				break;
		case 2: character.totalWeight += 10;
				character.yum = new Food("Apple", character.apple, character.apple);
				break;
		case 3: character.totalWeight += 15;
				character.yum = new Food("Banana", character.banana, character.banana);
				break;
		case 4: character.totalWeight += 20;
				character.yum = new Food("Cheeseburger", character.cheeseburger, character.cheeseburger);
				break;
		case 5: character.totalWeight += 25;
				character.yum = new Food("Pizza", character.pizza, character.pizza);
				break;
		case 6: character.totalWeight += 40;
				character.yum = new Food("Heaven Wrap", character.heavenWrap, character.heavenWrap);
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
		//A player object is created and initialized with the base information from the user
		Player player1 = new Player(character.name, character.bonusDamage, character.bonusDefense, character.bonusHealth, character.totalWeight);
		
		System.out.println("Based on your choices you have the following stats: "
							+ "\n" + player1.getPlayerStats());
		character.yum.setQuantity(1); //Food quantity is automatically set to 1
									//More food can be obtained by the user once the game is finished
		System.out.println("Now to demonstrate the Weapon, Armor, and Food classes"
						+ "\nWeapon examine method: " + "\n" + character.ouch.examine()
						+ "\nArmor examine method: " + "\n" + character.clang.examine()
						+ "\nand the other Armor object's examine method: " + "\n" + character.clunk.examine()
						+ "\nFood examine method: " + "\n" + character.yum.examine());
		
		
		
		
						
		keyboard.close();		
		
	}

}
