import java.util.ArrayList;
import java.util.List;

/* Composition is a restricted form of Aggregation in which two entities are highly dependent on each other */

// Java program to illustrate the concept of Composition

class Book {
	public String title;
	public String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
}

class Library {
	private final List <Book> books;
	
	Library(List<Book> books) {
		// TODO Auto-generated constructor stub
		this.books = books;
	}
	
	public List<Book> getTotalBooksInLibrary(){
		return books;
	}
}

public class Composition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating objects of book class
		Book b1 = new Book("Effective Java", "Joshua Bloch");
		Book b2 = new Book("Thinking In Java", "Bruce Eckel");
		Book b3 = new Book("Java: The Complete Reference", "Herbert Schildt");
		
		// creating the list which contains the no. of books
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		Library library = new Library(books);
		
		List<Book> nbks = library.getTotalBooksInLibrary();
		
		for(Book bk : nbks){
			System.out.println("Title: " + bk.title + " and " + "Author: " + bk.author);
		}
	}
}
