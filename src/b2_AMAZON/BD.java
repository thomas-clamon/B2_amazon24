package b2_AMAZON;

import java.time.LocalDate;

public class BD extends Livre {

	

	/**
	 * @param nom
	 * @param prix_achat
	 * @param date_creation
	 * @param auteur
	 * @param nb_page
	 * @param editeur
	 * @param age_minimum
	 * @param nb_chapite
	 * @param nb_case
	 */
	public BD(String nom, Float prix_achat, LocalDate date_creation, String auteur, Integer nb_page, String editeur,
			Integer age_minimum, Integer nb_chapite, Integer nb_case) {
		super(nom, prix_achat, date_creation, auteur, nb_page, editeur, age_minimum, nb_chapite);
		this.nb_case = nb_case;
	}

	private Integer nb_case;
	
	@Override
	public  Float  calculer_prix_vente() {
		return nb_case * 0.05F;
	}

	public Integer getNb_case() {
		return nb_case;
	}

	public void setNb_case(Integer nb_case) {
		this.nb_case = nb_case;
	}
	
	

}
