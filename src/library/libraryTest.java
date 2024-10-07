package library;

public class libraryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1=new Book("title1", "author1");
		book1.getBookInfo();
		book1.borrowBook();
		book1.getBookInfo();
		book1.returnBook();
		book1.getBookInfo();

	}

}
