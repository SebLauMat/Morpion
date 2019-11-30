package Controller;

public class CheckSymbol {
	public CheckSymbol() {
		
	}
	/**
	 * Check if symbol is OK, and return corresponding status.
	 * @param symbol
	 * @return int 1 or 2
	 */
	public int check(String symbol) {
		if(symbol.equals("X")) {
			return 1;
		}else {
			return 2;
		}
	}
}
