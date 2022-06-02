package lab;

public class BookClass {
	
	private int isbn;
	private String title;
	private String author;
	private double price;
	
	public BookClass(int isbn, String title, String author, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displaydetails() {
		System.out.println("isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price );
	}
	public void discountedPrice() {
		double discount = 12;
		double s = 100- discount;
		double amount = (s*price)/100;
		System.out.println("isbn=" + isbn + ", title=" + title + ", author=" + author + ",Discounted price=" + amount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookClass java = new BookClass(1, "Java", "James Gosling", 900);
		java.displaydetails();
		java.discountedPrice();
		

	}

}
