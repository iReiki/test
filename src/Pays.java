/**
 * 
 * @author jllys
 *
 */

public class Pays {
	
	private String nom;
	private String langue;
	private String monnaie;
	private Capitale saCapitale;
	private Ville[] lesVilles;
	private static int compteurPays = 0;
	private static int compteurVille = 0;
	private static int TAILLE = 10;
	
	
	/**
	 * Constructeur par défaut
	 */
	public Pays() {
		this.lesVilles = new Ville[TAILLE];
	}
	
	
	/**
	 * Constructeur de la classe Pays
	 * @param unNom
	 * @param uneLangue
	 * @param uneMonnaie
	 * @param nomCap
	 * @param habitants
	 * @param uneSuperficie
	 */
	public Pays(String unNom, String uneLangue, String uneMonnaie, String nomCap, int habitants, String uneSuperficie) {
		this.nom = unNom;
		this.langue = uneLangue;
		this.monnaie = uneMonnaie;
		this.saCapitale = new Capitale(nomCap, habitants, uneSuperficie);
		this.lesVilles = new Ville[TAILLE];
		compteurPays++;
	}
	
	/**
	 * @return le nom du pays
	 */
	public String getNom() {
		return this.nom;
	}
	
	/**
	 * Méthode setNom pour saisir le nom du pays
	 * @param unNom
	 */
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	/**
	 * @return le nom du pays en majuscule
	 */
	public String getNomMaj() {
		return this.nom.toUpperCase();
	}
	
	/**
	 * Méthode privée pour renvoyer la chaine sous la forme : 1ère lettre en majuscule et le reste en minuscule.
	 * @param chaine
	 * @return le nom du pays sous forme "Nom"
	 */
	private String defaultForme(String chaine) {
		String leNom = "";
		leNom += chaine.toUpperCase().charAt(0) + chaine.substring(1, chaine.length()).toLowerCase();
		return leNom;
	}
	
	/**
	 * 
	 * @return le compteur de pays
	 */
	public static int getCompteurPays() {
		return compteurPays;
	}
	
	/**
	 * Méthode pour ajouter une ville au tableau
	 * @param uneVille
	 */
	public void ajouterUneVille(Ville uneVille) {
		if(compteurVille < TAILLE) {
			this.lesVilles[compteurVille] = uneVille;
			compteurVille++;
		}	
	}
	
	/**
	 * Méthode de recherche d'une ville
	 * @param unNom
	 * @return true ou false selon si la ville existe ou non
	 */
	public boolean rechercherUneVille(String unNom) {
		int i = 0;
		while(i < compteurVille && !lesVilles[i].getNomVille().equals(unNom)) {
			i++;
		}
		if (i < compteurVille) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Méthode de suppression d'une ville à une position donnée
	 * @param position
	 */
	public void supprimerUneVille(int position) {
		int i = position;
		while(i < compteurVille) {
			if(i + 1 < compteurVille) {
				this.lesVilles[i] = this.lesVilles[i + 1];
			}
			else {
				this.lesVilles[i] = null;
			}
			i++;
		}
		if(position < compteurVille) {
			compteurVille--;
		}
	}
	
	/**
	 * 
	 * @return le tableau des villes
	 */
	public Ville[] getLesVilles() {
		return this.lesVilles;
	}
	
	/**
	 * @return les variables du pays sous forme de chaine
	 */
	public String toString() {
		String uneChaine = "";
		if(nom != null) {
			uneChaine += "Nom : " + this.defaultForme(this.nom);
		}
		if(langue != null) {
			uneChaine += "\nLangue : " + this.defaultForme(this.langue);
		}
		if(monnaie != null) {
			uneChaine += "\nMonnaie : " + this.defaultForme(this.monnaie);
		}
		// Affichage des informations de la capitale
		if(saCapitale != null) {
			uneChaine += "\nCapitale : " + this.saCapitale.toString();
		}
		// Affichage des informations des villes
		for(int i = 0; i < compteurVille; i++) {
			uneChaine += "\n\nVille n°" + (i+1);
			uneChaine += this.getLesVilles()[i].toString();
		}
		return uneChaine;
	}
}
