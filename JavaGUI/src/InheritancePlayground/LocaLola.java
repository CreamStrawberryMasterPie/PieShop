package InheritancePlayground;
import InheritancePlayground.Liquid;

public class LocaLola extends Liquid{
	private Liquid basicCharacteristics;
	private int price;
	private double carbonicAcidGramPerLiter;
	//default constructor
	public LocaLola(){
		basicCharacteristics = new Liquid();
		basicCharacteristics.setLiquid(2,0, "black (like my soul)");
		//price in euro per liter
		price = 2;
		carbonicAcidGramPerLiter= 6.5;		
	}
	public LocaLola(int AiL, int tox) {
		basicCharacteristics = new Liquid();
		basicCharacteristics.setLiquid(AiL,tox, "black (like my soul)");
		//price in euro per liter
		price = 2;
		carbonicAcidGramPerLiter= 6.5;	
	}
	public int getAmount() {
		return this.basicCharacteristics.getAmount();
	}
	public int getToxicity() {
		return this.basicCharacteristics.getToxicity();
	}
	
	private void printCharacteristics() {
		//print some bull***t with the class variables
		System.out.println("You got " + this.basicCharacteristics.getAmount() + " liters" + " of this beautiful " + this.basicCharacteristics.getColor() + " Liquid.");
		System.out.println("Rating the toxicity from 0 to 10, when 0 is drinkable, 5 is instant death and 7.5 is sweet lemonade. This liquid is rated " + this.basicCharacteristics.getToxicity() + "  Michelin stars.");
		System.out.println("I give it to you for the ridiculous price of " + this.price + " Darsek per Liter.");
		if (this.basicCharacteristics.getAmount()>1){
			System.out.println("This means the final price is only " + this.calculateTheWholePrice() + " Darsek. We accept all intergalactical credit cards.");
		}
		System.out.println("Enjoy " + this.calculateTheWholeAcidPortion() + " gram of pure Acid in your drink.");		
	}
	public String getFunTextWithAmountAndColor() {
		String myString;
		myString= "You got " + this.basicCharacteristics.getAmount() + " liters" + " of this beautiful " + this.basicCharacteristics.getColor() + " Liquid.";	
		return myString;
	}
	public String getFunTextWithToxicity() {
		String myString;
		myString= "Rating the toxicity from 0 to 10, when 0 is drinkable, 5 is instant death and 7.5 is sweet lemonade. This liquid is rated " + this.basicCharacteristics.getToxicity() + "  Michelin stars.";	
		return myString;
	}
	public String getFunTextWithPrice() {
		String myString;
		myString= "I give it to you for the ridiculous price of " + this.price + " Darsek per Liter.";	
		return myString;
	}
	public String getFunTextWithAcid() {
		String myString;
		myString= "Enjoy " + this.calculateTheWholeAcidPortion() + " gram of pure Acid in your drink.";	
		return myString;
	}
	private int calculateTheWholePrice() {
		int wholePrice;
		wholePrice=this.basicCharacteristics.getAmount()*this.price;	
		return wholePrice;
	}
	private double calculateTheWholeAcidPortion() {
		double wholeAcidPortion;
		wholeAcidPortion= this.carbonicAcidGramPerLiter* (double) this.basicCharacteristics.getAmount();	
		return wholeAcidPortion;
	}
	/**
	public static void main(String[] args) {
		LocaLola myLocaLola = new LocaLola();
		myLocaLola.printCharacteristics();
	}
	*/
}
