package Controller;

public class CheckNbPlayers {

	public CheckNbPlayers() {
		
	}
	/**
	 * Check Numbur of players.
	 * @param nbPlayers
	 * @return
	 */
	public boolean check(String nbPlayers) {
		if ( nbPlayers.equals("1") || nbPlayers.equals("2")) {
			return true;
		}
		return false;
	}
}
