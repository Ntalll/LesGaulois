package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[]tabgaulois;
	private int nbVillageois;
	private int nbVillageoisMaximum;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageois= 0;
		this.nbVillageoisMaximum=nbVillageoisMaximum;
		this.tabgaulois= new Gaulois[nbVillageoisMaximum];
		
		
	}
	public void setChef(Chef chef) {
		this.chef = chef;
		
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois<tabgaulois.length) {
			tabgaulois[nbVillageois]= gaulois;
			nbVillageois++;
		}
		else {
			System.out.println("Le village est plein");
		}
	}
	public Gaulois trouverHabitant(int identifiant) {
		if (identifiant<1 || identifiant>nbVillageois) {
			System.out.println(("Numéro non valide"));
			return null;
		}
		return tabgaulois[identifiant-1];
		
	}
	public void afficherVillageois() {
		System.out.println("Dans village du chef "+ chef.getNom()+ " vivent les légandaires gaulois : ");
		for(int i=0;i>nbVillageois;i++) {
			 System.out.println( trouverHabitant(i).getNom());
		}
	}
	public static void main(String[] args) {
		System.out.println("Debut");
		Village vil= new Village("Village des Irréductibles", 30);
		// Gaulois gaulois = vil.trouverHAbitant(30);
		Chef abraracourcix= new Chef("Abraracourcix",6,1,vil);
		vil.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		vil.ajouterHabitant(asterix);
		System.out.println("ajout");
		//Gaulois gaulois = vil.trouverHabitant(1);
		//System.out.println(gaulois);
		System.out.println(vil.trouverHabitant(1));
		System.out.println("fin");
		vil.afficherVillageois();
		Gaulois obelix = new Gaulois ("Obélix",25);
		vil.afficherVillageois();
		
	}

}
