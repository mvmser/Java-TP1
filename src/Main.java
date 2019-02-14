
public class Main {

	public static void main(String[] args) {
		Compteur compteur = new Compteur();

		System.out.println("######## TESTS DES COMPTEURS ########");
		System.out.println(compteur.toString());
		compteur.add(200000);
		System.out.println(compteur.toString());

		System.out.println("\n\n######## TESTS DES VEHICULES ########");
		Vehicule vehicule1 = new Vehicule(7);
		System.out.println(vehicule1.toString());
		
		double distanceParcourue = vehicule1.rouler(3);
		System.out.println("Le vehicule " + (int)vehicule1.getNumImmatriculation() + " a parcouru " + distanceParcourue + "kms");
		System.out.println(vehicule1.toString());
		
		distanceParcourue = vehicule1.rouler(30);
		System.out.println("Le vehicule " + (int)vehicule1.getNumImmatriculation() + " a parcouru " + distanceParcourue + "kms");
		System.out.println(vehicule1.toString());
		
		distanceParcourue = vehicule1.rouler(300);
		System.out.println("Le vehicule " + (int)vehicule1.getNumImmatriculation() + " a parcouru " + ((int)( distanceParcourue* 100.0)) / 100.0 + "kms");
		System.out.println(vehicule1.toString());

	}

}
