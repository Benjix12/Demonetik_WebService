package Modele;

public class EtatTransaction {

	private int numEtat;
	private String labelEtat;
	
	public EtatTransaction() {
		numEtat = 0;
		labelEtat = "Nouvelle transaction";
	}

	public EtatTransaction(int _numEtat, String _labelEtat){
		this.numEtat = _numEtat;
		this.labelEtat = _labelEtat;
	}
	
	public EtatTransaction init(){
		return this;
	}
	public EtatTransaction montant(int montant){
		return this;
	}
	public EtatTransaction porteurIdent(Porteur p){
		return this;
	}
	public EtatTransaction demandeAuto(int pin){
		return this;
	}
	public EtatTransaction terminer(){
		return this;
	}
	
	// Getters & Setters
	
	public int getNumEtat() {
		return numEtat;
	}

	public void setNumEtat(int numEtat) {
		this.numEtat = numEtat;
	}

	public String getLabelEtat() {
		return labelEtat;
	}

	public void setLabelEtat(String labelEtat) {
		this.labelEtat = labelEtat;
	}
	

}
