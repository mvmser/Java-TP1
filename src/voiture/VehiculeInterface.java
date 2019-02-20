package voiture;

public interface VehiculeInterface {
	
}

//reset all partiel
class ResetPartiel implements Fonction<Vehicule>{

	@Override
	public void applyIt(Vehicule vehicule) {
		vehicule.getCompteur().resetPartiel();
	}
}


//Faire le plein s'il reste moins de 10 litres
class FaireLePlein implements Fonction<Vehicule>{

	@Override
	public void applyIt(Vehicule vehicule) {
		if (vehicule.getJauge() < 10)
			vehicule.faireLePlein();
	}
}