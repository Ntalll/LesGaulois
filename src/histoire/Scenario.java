package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix =  new Gaulois("asterix",8);
		Romain minus = new Romain("Minus", 6);
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU.... GUN GAUGU");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
	}

}
