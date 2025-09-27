package Sept20;


/*
 * Library Management
Base class Book with attributes title, author, price.
Derived classes:

EBook (extra field: fileSize).

PrintedBook (extra field: numberOfPages).*/

class Book{
	String title="C lanaguage";
	String author="Dennis Ritchie";
	int price=250;
}
class EBook extends Book{
	String fileSize="2MB";
	
}
	class PrintedBook extends EBook{
		int numberOfPages=500;
}
public class Test4 {

	public static void main(String[] args) {
		
		PrintedBook p=new PrintedBook();
		
		System.out.println("Book Title:"+p.title+"\nBook Author Name:"+p.author+"\nBook Prise: "+p.price+"\nBook File size:"+p.fileSize+"\nNumber of pages:"+p.numberOfPages);

	}

}