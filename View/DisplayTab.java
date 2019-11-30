package View;

import Model.Plateau;

public class DisplayTab {
	public void displayTab(Plateau p1) { // -> View
		for(int i = 0; i < 3; i++ ) {
			for(int j = 0; j < 3; j++) {
				System.out.print(p1.getCase(i, j));
			}
			System.out.println("");
		};
	}
}
