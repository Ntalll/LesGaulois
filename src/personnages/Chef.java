package personnages;
public class Chef extends Gaulois {
	private String nom;
	private int force;
	private Village village;
	
	public Chef(String nom, int force,  Village village) {
		super(nom,force);
		this.village = village;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

	private String prendreParole() {
		return "Le chef " + nom + " du village" + village.getNom() +" : ";
	}



	

}
