

public class Item {
	
	private String itemName = " ";			//fields for storing
	private int itemWeight = 0;				//item information
	
	public Item(String name, int weight) //constructor to set item info
	{
		this.itemName = name;
		this.itemWeight = weight;
		
	}
	
	
	public String getName()					//returns the item name
	{
		return itemName;
	}
	
	public int getWeight()					//returns the item weight
	{
		return itemWeight;
	}
	
	public String examine()					//returns description of item
	{
		return "Item: " + itemName + "\n" + "Weight: "
				+ itemWeight + "\n";

		
	}

}
