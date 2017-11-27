package composite;

public class Book extends BookComponent {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void display() {
		System.out.println(String.format("book title = [%s], autho = [%s]", title, author));
	}
}
