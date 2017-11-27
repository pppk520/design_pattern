package iterator;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		ComicBooks comicBooks = new ComicBooks(5);
		comicBooks.appendBook(new ComicBook("One Piece"));
		comicBooks.appendBook(new ComicBook("Hunter X Hunter"));
		comicBooks.appendBook(new ComicBook("World Trigger"));
		
		System.out.println(String.format("Total books = %s", comicBooks.getLength()));
		
		Iterator it = comicBooks.iterator();
		while (it.hasNext()) {
			ComicBook book = (ComicBook) it.next();
			System.out.println(String.format("book title: %s", book.getName()));
		}
		
		VideoGames videoGames = new VideoGames();
		videoGames.appendGame("Dragon Quest");
		videoGames.appendGame("Final Fantasy");
		
		it = videoGames.iterator();
		while (it.hasNext()) {
			String game = (String) it.next();
			System.out.println(String.format("game title: %s", game));
		}
		
	}
	
}
