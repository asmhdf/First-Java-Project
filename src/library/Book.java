package library;

public class Book {
private String title;
private String author;
private boolean isAvailable;

public Book (String title,String author) {
	this.title=title;
	this.author=author;
	this.isAvailable =  true;
}
public void borrowBook() {
	if (this.isAvailable==true) {
		this.isAvailable=false;}
		else {
			System.out.println("The book is already borrowed.");
		}
	}
public void returnBook() {
	this.isAvailable=true;
}
public void getBookInfo() {
	System.out.println(this.title+this.author+this.isAvailable);
}

}
