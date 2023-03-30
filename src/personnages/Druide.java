package personnages;
import java.util.Random;
public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;


	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide" + nom + "et ma potion peur aller d'une force" + effetPotionMin + "à"
				+ effetPotionMax + ".");
	}
	public int getForcePotion() {
		return forcePotion;
	}

	public void setForcePotion(int forcePotion) {
		this.forcePotion = forcePotion;
	}


	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");

	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void preparerPotion(int effetPotionMin,int effetPotionMax) {
		Random random  = new Random();
		int val= random.nextInt(effetPotionMax + 1);
		while (val<effetPotionMin) {
			val = random.nextInt(effetPotionMax + 1);
		}
		if (val > 7) {
			parler("J'ai préparé une super potion de force"+ val);
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force"+val);	
			}
		setForcePotion(val);
	}
	public static void main(String[] args) {
		new panoramix= Druide("Panoramix", )
	}

}
