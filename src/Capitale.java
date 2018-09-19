public class Capitale {
	
	private String nom;
	private int nbHabitants;
	private String superficie;
	
	public Capitale(String unNom, int habitants, String uneSuperficie) {
		this.nom = unNom;
		this.nbHabitants = habitants;
		this.superficie = uneSuperficie;
	}
	
	
	public String getNom() {
		return this.nom;
	}
	
	public void setNom(String unNom) {
		this.nom = unNom;
	}
	
	public int getNbHabitants() {
		return this.nbHabitants;
	}
	
	public void setNbHabitants(int habitants) {
		this.nbHabitants = habitants;
	}
	
	public String getSuperficie() {
		return this.superficie;
	}
	
	public void setSuperficie(String uneSuperficie) {
		this.superficie = uneSuperficie;
	}
	
	public String toString() {
		String uneChaine = "";
		if(nom != null) {
			uneChaine += "Nom de la capitale : " + this.nom;
		}
		if(nbHabitants != 0) {
			uneChaine += "\nNombre d'habitants : " + this.nbHabitants;
		}
		if(superficie != null) {
			uneChaine += "\nSuperficie : " + this.superficie;
		}
		return uneChaine;
	}
}
