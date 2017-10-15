package InheritancePlayground;

public class Liquid {
	//class variables
	private int amountInLiters;
	private int toxicity;
	private String color;
	
	//default constructor
	Liquid(){
		amountInLiters=1;
		toxicity=0;	
		String color = new String();
		color ="Transparent";
	}
	protected void setLiquid(int aIL, int t, String color) {
		this.amountInLiters=aIL;
		this.toxicity=t;
		this.color = color;
	}
	protected int getAmount() {	
		return this.amountInLiters;
	}
	protected int getToxicity() {	
		return this.toxicity;
	}
	protected String getColor() {
		return this.color;
	}
}
