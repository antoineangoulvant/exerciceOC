public class Personne{
	private String nom;
	private String prenom;
	private int age;
	private float taille;

	public Personne(String nom, String prenom, int age, float taille){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.taille = taille;
	}

	public String toString(){
		return this.prenom + " " + this.nom + " a " + this.age + " ans et fait " + this.taille + "m.";
	}
}