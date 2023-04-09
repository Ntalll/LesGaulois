package personnages;



public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*3);

	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcePotion) {
		effetPotion= forcePotion;
		if (forcePotion==3) {
			System.out.println("Merci Druide, je sens que ma force est 3 fois d�cupl�e.");	
		}
		
	}

	public static void main(String[] args) {
		Gaulois asterix= new Gaulois( "Asterix",8);
		System.out.println(asterix);
		System.out.println(asterix.nom);
		System.out.println(asterix);
		asterix.parler("je suis asterix");
		Romain Jean = new Romain("Jean", 9);
		asterix.frapper(Jean);
		asterix.frapper(Jean);
		asterix.frapper(Jean);
		asterix.frapper(Jean);
		asterix.frapper(Jean);
		asterix.boirePotion(3);

		
		
		
	}
}
