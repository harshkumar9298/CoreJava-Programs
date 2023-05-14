package test;
public enum Cars {
	figo(900),alto(400),dezire(700);//static final Elements
	public int price;//Variable
	private Cars(int price)//Constructor
	{
		this.price=price;
	}

	public int getPrice()//method
	{
		return price;
	}
}