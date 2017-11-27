package composite;

public class Main {
	public static void main(String[] args) {
		BookComponent allBooks = new BookGroup("books", "all collections");
		
		BookComponent comicBooks = new BookGroup("comic", "super good");
		
		comicBooks.add(new Book("One Piece", "尾田榮一郎"));
		comicBooks.add(new Book("Hunter X Hunter", "冨樫義博"));
		comicBooks.add(new Book("World Trigger", "葦原大介"));
		
		BookComponent professionalBooks = new BookGroup("professional", "to learn");
		
		professionalBooks.add(new Book("Head First Design Patterns", "Bert Bates, Kathy Sierra, Eric Freeman, Elisabeth Robson"));
		professionalBooks.add(new Book("Deep Learning", "Ian Goodfellow and Yoshua Bengio"));
		
		allBooks.add(comicBooks);
		allBooks.add(professionalBooks);
		
		allBooks.display();
	}
}
