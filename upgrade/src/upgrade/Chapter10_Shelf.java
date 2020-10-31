package upgrade;

import java.util.ArrayList;

public class Chapter10_Shelf {
	protected ArrayList<String> shelf;

	public Chapter10_Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public int getCount() {
		return shelf.size();
	}
}
