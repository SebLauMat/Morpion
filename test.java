import java.util.Scanner;

public class test {



	public static void main(String[] args) {
		char[]grid=
			{
					' ',' ',' ',
					' ',' ',' ',
					' ',' ',' ',
			};
		char p1='O';
		char p2='X';
		char currentPlayer=p1;
		Scanner scanner= new Scanner(System.in);
		String input;
		while (true) {
			System.out.println("["+grid[0]+'|'+grid[1]+'|'+grid[2]+"]");
			System.out.println("["+grid[3]+'|'+grid[4]+'|'+grid[5]+"]");
			System.out.println("["+grid[6]+'|'+grid[7]+'|'+grid[8]+"]");
			int c;
			while(true) {
				System.out.print("player");
				input=scanner.nextLine();
				try {
					c=Integer.parseInt(input);
					if(1<=c&&c<=9 && grid[c-1]!=p1 &&grid[c-1]!=p2)
						break;
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			grid[c-1]=currentPlayer;
			if (currentPlayer== p1)
				currentPlayer=p2;
			else {
				currentPlayer=p1;
			}
		}
	}
}



