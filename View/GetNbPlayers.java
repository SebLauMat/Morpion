package View;
import Controller.*;
import java.util.Scanner;
/**
 * 29/11/2019
 * @author mathi
 *
 */

public class GetNbPlayers {

	public GetNbPlayers() {
		
	}

	
	
	/**
	 * get numbers of players (tested OK)
	 * @return int
	 */
	public int NbPlayers() {
		Scanner scan = new Scanner(System.in);
		boolean response = false;
		String result = "";
		CheckNbPlayers checkNb = new CheckNbPlayers();
		while ( response == false) {
			System.out.println("Merci de saisir le nombre de joueur.");
			result = scan.nextLine();
			response = checkNb.check(result);
		}
		scan.close();
		return Integer.parseInt(result);
	}
}
