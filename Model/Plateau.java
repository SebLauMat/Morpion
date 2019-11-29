package Model;

public class Plateau {

	private Case[][] Plateau;
	protected int c;

	// Constructor
	public Plateau() {
		this.Plateau = new Case[3][3];	
		CreateTab();
	}


	// Plateau creation
	private void CreateTab() {
		System.out.print("\n");
		for(int i=0; i<3; i++) { // -> Num ligne
			for (int j = 0; j < 3; j++) { // -> Num colonne
				Plateau[i][j] = new Case();
				System.out.print("      ");
				if(j == 0) {
					System.out.print(getCase(i,j)+ "| ");
				}
				if(j == 1) {
					System.out.print(getCase(i,j)+ "| ");
				}
				if(j == 2) {
					System.out.print(getCase(i,j)+ " ");
				}
				if(j == 2 && i <2) {
					System.out.print("\n_______|________|_________ \n");
				}
				if(i == 2 && j == 2) {
					System.out.println("\n       |        |           \n");
				}
			}
		}
	}

	// isEmpty
	public boolean isEmpty(int x, int y) { // -> Controller
		// if case.value == sign 
		if(Plateau[x][y].getStatus() == c) { // caution c is equal to sign
			return false;
		} 
		return true;
	}
	//getter and setter
	
	// Allow to choose a particular square in the plateau
	public boolean setCase(int x, int y) { // -> player
		Plateau[x][y].setStatus(c);
		//System.out.println(Plateau[x][y]);
		return true;
	}
	public int getCase(int x, int y) { // -> Party
		return Plateau[x][y].getStatus();
	}

	public void displayTab() { // -> View
		for(int i = 0; i<3; i++ ) {
			for(int j =0; j<3; j++) {
				System.out.print(Plateau[i][j].getStatus());
			}
			System.out.println("");
		};
	}
}

