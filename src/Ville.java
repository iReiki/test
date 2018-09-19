public class Ville {
	
	private String nom;
	private int nbHabitants;
	private String superficie;
	
	public Ville(String unNom, int habitants, String uneSuperficie) {
		this.nom = unNom;
		this.nbHabitants = habitants;
		this.superficie = uneSuperficie;
	}
	
	public String getNomVille() {
		return this.nom;
	}
	
	public String toString() {
		String uneChaine = "";
		if(nom != null) {
			uneChaine += "\nNom de la ville : " + this.nom;
		}
		if(nbHabitants != 0) {
			uneChaine += "\nNombre d'habitants de la ville: " + this.nbHabitants;
		}
		if(superficie != null) {
			uneChaine += "\nSuperficie de la ville : " + this.superficie;
		}
		return uneChaine;
	}
}
