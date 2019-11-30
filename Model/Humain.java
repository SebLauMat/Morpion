package Model;




//humain hérite de player
public class Humain extends Joueur {
	public Humain(String name, int signe ) {
		this.name=name;
		this.signe=signe;
//		System.out.println(" Salut "+name+ " tu es le joueur 1.");
	}
	
	@Override
	public char play() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int getRandomNb() {
		int randNb= (int) (Math.random()*10);
		return randNb;
	}
}
