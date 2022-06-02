package oop04;

public class Book {
	String bookName;
	String bookAuther;
	double bookPrice;
	static double discount;
	
	public void getBookDetails(	String bookName, String bookAuther, int bookPrice) {
		this.bookName = bookName;
		this.bookAuther = bookAuther;
		this.bookPrice = bookPrice;
	}
	public void showBookDetails() {
		System.out.println(" bookName "+ bookName);
		System.out.print(" bookAuther "+ bookAuther);
		System.out.print(" bookPrice "+ bookPrice);
		System.out.println(" Price after discount "+calculateDiscount());
	}

	
	public static void setDiscount(double discount) {
		Book.discount = discount;
	}						
	
	public double calculateDiscount() {
		double actualPrice = bookPrice - ((discount/100)* bookPrice);
		return actualPrice;
	}
	

}
