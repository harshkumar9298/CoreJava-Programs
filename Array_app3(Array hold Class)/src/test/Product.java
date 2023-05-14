package test;
public class Product {
	public String pCode,pName;
	public float pPrice;
	public int pQty;
	public Product(String pCode,String pName,

			float pPrice,int pQty)

	{
		this.pCode=pCode;
		this.pName=pName;
		this.pPrice=pPrice;
		this.pQty=pQty;
	}
	//we are loading Local Variables data to Instance Variables
	//we use &#39;this&#39; keyword because same names in
	//Local variables and Instance Variables
	public String toString() {
		return pCode+"\t"+pName+"\t"+pPrice+"\t"+pQty;
		
}
}