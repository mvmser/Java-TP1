package voiture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Garage implements Iterable<Vehicule> {
	//Liste contenant plusieurs vehicules
    private List<Vehicule> vehicules;

    //Constructeur
    public Garage(){
    	//vehicules est une ArrayList
        vehicules = new ArrayList<Vehicule>();
    }

    @Override
    public Iterator<Vehicule> iterator(){
        return vehicules.iterator();
    }

    public void add(Vehicule vehicule){
    	//On ajoute un vehicule a l'arrayList grace a la methode add
        vehicules.add(vehicule);
    }

    @Override
    public String toString(){
        return vehicules.toString();
    }


    //Trier selon le num d'immatriculation
    public void triNoImmatriculion(){
        Collections.sort(vehicules);
    }

    //Trier selon le compteur
    public void triCompteur() {
		Collections.sort(vehicules, new ComparateurCompteur());
	}
    

}
