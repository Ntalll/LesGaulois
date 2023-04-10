package personnages;

public class Romain {
		private String nom;
		private int force;
		
		public Romain(String nom, int force) {
			this.nom = nom;
			this.force = force;
			assert force >0 : "La force doit etre positive";
			
		} 
		public String getNom() {
			return nom;
		}
		
		public void parler(String texte) {
			System.out.println(prendreParole() +"<<" + texte + ">>");
			
		}
		
		private String prendreParole() {
			return "Le romain " + nom + " : ";
		}
		public void recevoirCoup(int forceCoup) {
			assert force >0 : "La force doit etre positive";
			int tempforce=force;
			force -= forceCoup;
			if (force > 0) {
				parler ("Aie");
				
			} else {
				parler("J'abandonne...");

			}
			assert tempforce!=force : "La force d'un romain n'a pas diminué";			
		}

			
		public static void main(String[] args) {
			 Romain louis = new Romain("Louis", 6);
			 louis.parler("Bonjour");
			 
			
		}
}
