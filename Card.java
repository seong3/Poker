public class Card{
	
	public String name;
	public int value;
	public String suit;
	
	
	
	public Card(String nameIn, int valueIn, String suitIn){
		
		name = nameIn;
		value = valueIn;
		suit = suitIn;
		
	}
	
	public String toString(){
		return name;
	}
}