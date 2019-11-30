package Model;


public abstract class Joueur {
	// creation d'un joueur
		public String name;
		public int signe;
		// methode qui permet d'écrire sur une case
		
		public abstract char play();
		
		public abstract int getRandomNb();
		
		public void setSign(int choice) {// -> setter de signe
			signe = choice;
		}
		
		public int getSign() {
			return signe;
		}
}
