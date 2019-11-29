package Model;

import java.util.Scanner;

public class Partie 
{
//	Scanner scan = new Scanner(System.in);
//	Joueur joueur1 = getJoueur1();
//	Joueur joueur2 = getJoueur2();
//	boolean deuxJoueursOuIA = false;
	

	public void Game() 
	{
		//info joueur 1
		boolean etatjoueur1 = false;
		String nameJ1="";
		int signeJoueur1 = 0;
		//info joueur2
		String nameJ2="";
		int signeJoueur2 = 0;
		//info partie
		Humain joueurActif = null;
		boolean partieType = false;
		boolean deuxJoueurs = false;
		Scanner scan = new Scanner(System.in);
		boolean tour = true;
		boolean reponseValide = false;
		//Je demande si 1 ou de 2 joueurs.
		//je demande le nom et le signe du joueur 1.
		System.out.println("Merci de saisir ton Nom: ");
		nameJ1 = scan.nextLine();
		while( etatjoueur1 == false)
		{
			System.out.println("Ok "+nameJ1 + " , quel symbole veux-tu jouer? Le X ou le O.");
			String signeIn = scan.nextLine();
			if( signeIn.intern() == "X" || signeIn.intern() == "O")
			{
				if(signeIn.intern() == "X") 
				{
					etatjoueur1 = true;
					signeJoueur1 = 1;
				}
				else if(signeIn.intern() == "O") 
				{
					etatjoueur1 = true;
					signeJoueur1 = 2;
				}	
			}	
		}// end player 1
		Humain toto = new Humain(nameJ1, signeJoueur1);
		joueurActif = toto;
		//Je demande le nom et le signe du joueur 2.
		while ( partieType == false) 
		{
			System.out.println("1 Joueur ou 2 Joueurs ?");
			String reponse = scan.nextLine();
			if(reponse.intern() == "1") 
			{
				//joueur2 = IA
				partieType = true;
			}
			else if(reponse.intern() == "2") 
			{
				System.out.println("Merci de saisir le nom du joueur 2. ");
				nameJ2 = scan.nextLine();
				if(toto.signe == 1) 
				{
					signeJoueur2 = 2;
				}
				else if(toto.signe == 2)
				{
					signeJoueur2 = 1;
					deuxJoueurs = true;
				}
				partieType = true;
			}
		}//fin joueur 2
		Humain tata = new Humain(nameJ2, signeJoueur2);// ATTENTION a gérer si c'est l'IA qui est sélectionnée.
		//j'initialise le plateau.
		Plateau p1 = new Plateau();
		
		//Je demande ceux que veu jouer le J1, en gérand les conditions de victoire
		while(tour ==true)
		{
			//Afficher le plateau mit a jour ici.
			p1.displayTab();
			while(reponseValide == false) 
			{
				System.out.println(joueurActif.name + " a toi de jouer, choisi une case entre 1 et 9");
				String reponseJoueur = scan.nextLine();
				int[] listeLigne = new int[] {0,0,0,1,1,1,2,2,2};
				int[] listeColonne = new int[] {0,1,2,0,1,2,0,1,2};
				int ligne = 0;
				int colonne = 0;
				if(reponseJoueur.equals("1")|| reponseJoueur.equals("2")|| reponseJoueur.equals("3")|| reponseJoueur.equals("4")|| reponseJoueur.equals("5")|| reponseJoueur.equals("6")|| reponseJoueur.equals("7")|| reponseJoueur.equals("8")|| reponseJoueur.equals("9"))
				{
					ligne = listeLigne[Integer.parseInt(reponseJoueur)-1];
					colonne = listeColonne[Integer.parseInt(reponseJoueur)-1];
					
				}
				if(p1.isEmpty(ligne, colonne,joueurActif.signe)) 
				{
					p1.setCase(ligne, colonne,joueurActif.signe);
					reponseValide = true;
				}
				
				for(int i =0;i<p1.Plateau.length; i++) {
					
				}
			}
			if(deuxJoueurs==false) 
			{
				if (joueurActif == toto)
				{
					joueurActif = tata;//définir l'IA
				}
				else 
				{
					joueurActif = toto;
				}
			}
			else
			{
				if (joueurActif == toto)
				{
					joueurActif = tata;
				}
				else 
				{
					joueurActif = toto;
				}
			}
			reponseValide = false;
			
		}
		
		
		
		
	}
	
	
	
	
	
	
//	public Joueur getJoueur1() 
//	{
//		boolean etatjoueur1 = false;
//		System.out.println("Merci de saisir ton Nom: ");
//		String nameJ1 = scan.nextLine();
//		int signe = 0;
//		while( etatjoueur1 == false)
//			{
//				System.out.println("Ok "+nameJ1 + " , quel symbole veux-tu jouer? Le X ou le O.");
//				String signeIn = scan.nextLine();
//				if( signeIn.intern() == "X" || signeIn.intern() == "O")
//				{
//					if(signeIn.intern() == "X") 
//					{
//						etatjoueur1 = true;
//						signe = 1;
//					}
//					else if(signeIn.intern() == "O") 
//					{
//						etatjoueur1 = true;
//						signe = 2;
//					}	
//				}	
//			}
//		
//		partieType();
//		return  new Humain(nameJ1, signe);
//		
//	}
//	
//	public void partieType() 
//	{
//		boolean etatPartie = false;
//		while(etatPartie == false ) 
//		{
//			
//			System.out.println("1 Joueur ou 2 Joueurs ?");
//			String reponse = scan.nextLine();
//			if(reponse.intern() == "1") 
//			{
//				//joueur2 = IA
//			}
//			else if(reponse.intern() == "2") 
//			{
//				deuxJoueursOuIA = true;
//				getJoueur2();
//			}
//			
//		}
//	}
//	
//	public Joueur getJoueur2() 
//	{
//		System.out.println("Merci de saisir le nom du joueur 2. ");
//		System.out.println(joueur1.name);
//		String nameJ2 = scan.nextLine();
//		int signe = 0;
//		if(joueur1.signe == 1) {
//			signe = 2;
//		}
//		else if(joueur1.signe == 2)
//		{
//			signe = 1;
//		}
//		return new Humain(nameJ2, signe);
//	}
//	
//	public void creationPlateau() 
//	{
//		
//	}
//
//	public void tourJoueur1() 
//	{
//		
//	}
//	
//	public void tourJoueur2() 
//	{
//		
//	}
//	
//	public void finDePartie() 
//	{
//		
//	}
//
}
