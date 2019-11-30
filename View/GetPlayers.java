package View;
import java.util.Scanner;
import Model.Humain;
import Controller.*;

/**
 * 29/11/2019
 * @author mathi
 *
 */
public class GetPlayers {
	public GetPlayers() {
		
		
	}
	
	public Humain[] getPlayers(int nbPlayers) {
		boolean response = false;
		Scanner scan = new Scanner(System.in);
		String name = "";
		int symbole = 0;
		for ( int i = 0 ; i <= nbPlayers ; i++) {
			System.out.println("Merci de saisir le nom du joueur " + i+1);
			name=scan.nextLine();
			if ( i == 0) {
				symbole=getSymbole();
			}
			return new Humain(name,symbole);
		}
	}
	
	private int getSymbole() {
		Scanner scan = new Scanner(System.in);
		CheckSymbol check = new CheckSymbol();
		String response = "";
		int result = 0;
		while(result!= 1 || result != 2) {
			System.out.println("Quel symbole veux tu utiliser? X ou O?");
			response=scan.nextLine();
			result = check.check(response);
		}
		scan.close();
		return result;
	}
}



