public class Book extends TangibleAsset{
	private String isbn;
	public Book(String name, int price, String color, Stiring isbn){
		super(name, price, color);
		this.isbn = isbn;
	}
	public String getIsbn(){return this.isbn;}
}
