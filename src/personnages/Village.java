package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] tabgaulois;
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
		if (nbVillageois<nbVillageoisMaximum) {
			tabgaulois[nbVillageois]= gaulois;
			nbVillageois++;
		}
		else {
			System.out.println("Le village est plein");
		}
	}
	public Gaulois trouverHabitant(int identifiant) {
		if (identifiant<0 || identifiant>nbVillageois) {
			System.out.println(("Num�ro non valide"));
			return null;
		}
		return tabgaulois[identifiant];
		
	}
	public void afficherVillageois() {
		System.out.println("Dans village du chef "+ chef.getNom()+ " vivent les l�gandaires gaulois : ");
		for(int i=0;i<nbVillageois;i++) {
			 System.out.println( trouverHabitant(i).getNom());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Debut");
		Village vil= new Village("Village des Irr�ductibles", 30);
		// Gaulois gaulois = vil.trouverHAbitant(30);
		Chef abraracourcix= new Chef("Abraracourcix",6,vil);
		vil.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Ast�rix",8);
		vil.ajouterHabitant(asterix);
		System.out.println("ajout");
		System.out.println(vil.tabgaulois[0]);
		
		//Gaulois gaulois = vil.trouverHabitant(1);
		//System.out.println(gaulois);
		System.out.println(vil.trouverHabitant(0 ));
		System.out.println("fin");
		System.out.println(vil.nbVillageois);
		System.out.println(vil.nbVillageoisMaximum);
		vil.afficherVillageois();
		Gaulois obelix = new Gaulois ("Ob�lix",25);
		vil.ajouterHabitant(obelix);
		vil.afficherVillageois();
		
	}

}
