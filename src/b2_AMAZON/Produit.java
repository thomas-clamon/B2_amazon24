package b2_AMAZON;

import java.time.LocalDate;

public abstract class Produit {
	
	private String nom;
	private Float prix_achat;
	private LocalDate date_creation;
	
	
	public abstract Float  calculer_prix_vente();
	
	
	public Produit()
	{
		super();
	}
	
	/**
	 * @param nom
	 * @param prix_achat
	 * @param date_creation
	 */
	public Produit(String nom, Float prix_achat, LocalDate date_creation) {
		super();
		this.nom = nom;
		this.prix_achat = prix_achat;
		this.date_creation = date_creation;
	}



	public Float marge() {
		return calculer_prix_vente() - prix_achat;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Float getPrix_achat() {
		return prix_achat;
	}
	public void setPrix_achat(Float prix_achat) {
		this.prix_achat = prix_achat;
	}
	public LocalDate getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(LocalDate date_creation) {
		this.date_creation = date_creation;
	}
	
	

}
