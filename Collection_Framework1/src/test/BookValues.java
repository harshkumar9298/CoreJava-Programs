package test;
public class BookValues {
	public String bName,bAuthor;
	public float bPrice;
	public int bQty;
	public BookValues(String bName,String bAuthor,float bPrice, int bQty)
	{
		this.bName=bName;
		this.bAuthor=bAuthor;
		this.bPrice=bPrice;
		this.bQty=bQty;
	}
	public String toString() {
		return bName+"\t"+bAuthor+"\t"+bPrice+"\t"+bQty;
	}
}