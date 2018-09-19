//import java.util.*;

public class Main {

	//private static Scanner clavier = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		/*
		System.out.println("Saisir un nom : ");
		String nom = clavier.nextLine();
		System.out.println("Saisir une langue : ");
		String langue = clavier.nextLine();
		System.out.println("Saisir une monnaie : ");
		String monnaie = clavier.nextLine();
		System.out.println("Saisir une capitale : ");
		String capitale = clavier.nextLine();
		System.out.println("Saisir son nombre d'habitants : ");
		int nb = clavier.nextInt();
		clavier.nextLine();
		System.out.println("Saisir sa superficie : ");
		String superficie = clavier.nextLine();
		
		Pays unPays = new Pays(nom, langue, monnaie, capitale, nb, superficie);
		System.out.println(unPays.toString());
		System.out.println(Pays.getCompteurPays());
		*/
		
		Pays unPays = new Pays("France", "Français", "euro", "Paris", 10000, "100" );
		Ville uneVille = new Ville("Lieusaint", 10, "500");
		Ville autreVille = new Ville("Melun", 50, "600");
		unPays.ajouterUneVille(uneVille);
		unPays.ajouterUneVille(autreVille);
		System.out.println(unPays.toString());
		System.out.println(unPays.rechercherUneVille("Melun"));
		System.out.println(unPays.rechercherUneVille("Paris"));
		unPays.supprimerUneVille(0);
		System.out.println(unPays.toString());
		
		// coucou :)
	}

}
