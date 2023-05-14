package test;
public class BookData {
	public String bCode,bName,bAuthor;
	public float bPrice;
	public int bQty;
	public BookData(String bCode,String bName,String bAuthor,

			float bPrice,int bQty)

	{
		this.bCode=bCode;
		this.bName=bName;
		this.bAuthor=bAuthor;
		this.bPrice=bPrice;
		this.bQty=bQty;
	}
	//we are loading Local Variables data to Instance Variables
	//we use &#39;this&#39; keyword because same names in
	//Local variables and Instance Variables
	public String toString() {
		return bCode+"\t"+bName+"\t"+bAuthor+"\t"+bPrice+"\t"+bQty;

	}
}