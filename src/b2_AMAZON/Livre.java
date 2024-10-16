package b2_AMAZON;

import java.time.LocalDate;

public abstract class Livre extends Produit {
	

	

	/**
	 * @param nom
	 * @param prix_achat
	 * @param date_creation
	 * @param auteur
	 * @param nb_page
	 * @param editeur
	 * @param age_minimum
	 * @param nb_chapite
	 */
	public Livre(String nom, Float prix_achat, LocalDate date_creation, String auteur, Integer nb_page, String editeur,
			Integer age_minimum, Integer nb_chapite) {
		super(nom, prix_achat, date_creation);
		this.auteur = auteur;
		this.nb_page = nb_page;
		this.editeur = editeur;
		this.age_minimum = age_minimum;
		this.nb_chapite = nb_chapite;
	}
	public Livre() {
		super();
	}

	private String auteur;
	private Integer nb_page;
	private String editeur;
	private Integer age_minimum;
	private Integer nb_chapite;
	
	public  Float  calculer_prix_vente() {
		return  nb_page * 0.20F;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Integer getNb_page() {
		return nb_page;
	}

	public void setNb_page(Integer nb_page) {
		this.nb_page = nb_page;
	}

	public String getEditeur() {
		return editeur;
	}

	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	public Integer getAge_minimum() {
		return age_minimum;
	}

	public void setAge_minimum(Integer age_minimum) {
		this.age_minimum = age_minimum;
	}

	public Integer getNb_chapite() {
		return nb_chapite;
	}

	public void setNb_chapite(Integer nb_chapite) {
		this.nb_chapite = nb_chapite;
	}
	
	
	
	

}
