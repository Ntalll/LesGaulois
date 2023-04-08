package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix =  new Gaulois("asterix",8);
		Romain minus = new Romain("Minus", 6);
		Gaulois obelix= new Gaulois("Ob�lix", 8);
		Druide panoramix=new Druide("Panoramix", 5, 10);
		panoramix.parler("Je vais aller pr�parrer une petite potion");
		panoramix.preparerPotion(5, 10);
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste");
		panoramix.booster(asterix);
		asterix.parler("Merci Druide, je sens que ma force est 6 fois d�cupl�e.");
		asterix.parler("Bonjour");
		minus.parler("UN GAU.... GUN GAUGU");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
	}

}
