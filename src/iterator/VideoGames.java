package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VideoGames {
	private List<String> games;
	
	public VideoGames() {
		games = new ArrayList<>();
	}
	
	public void appendGame(String title) {
		games.add(title);
	}
	
	public Iterator iterator() {
		return this.games.iterator();
	}
}
