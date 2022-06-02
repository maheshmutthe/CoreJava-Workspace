package oop04;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book.setDiscount(10);
		Book book1 = new Book();
		book1.getBookDetails("Java", "James Gosling", 900);
		
		Book book2 = new Book();
		book2.getBookDetails("OOP", "Grady buch", 600);
		
		book1.showBookDetails();
		book2.showBookDetails();
		
		

	}

}
