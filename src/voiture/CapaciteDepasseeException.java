package voiture;

public class CapaciteDepasseeException extends Exception{

    //private double depassementJauge;

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Constructeur
    public CapaciteDepasseeException(String message ){
        //this.depassementJauge = depassementJauge;
        //System.out.printf("Il y a %.2fl d'essence en trop!!%n", depassementJauge);
        super(message);
    }
/*
    String getMessage(){
        String val = 
		String.format("Il y a %fl d'essence en trop!!", depassementJauge);
		return val;
    }
    */
}