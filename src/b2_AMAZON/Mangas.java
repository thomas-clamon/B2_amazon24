package b2_AMAZON;

import java.time.LocalDate;

public class Mangas extends Livre {
	
	private String SensLecture = "DG";

	/**
	 * @param nom
	 * @param prix_achat
	 * @param date_creation
	 * @param auteur
	 * @param nb_page
	 * @param editeur
	 * @param age_minimum
	 * @param nb_chapite
	 * @param sensLecture
	 */
	public Mangas(String nom, Float prix_achat, LocalDate date_creation, String auteur, Integer nb_page, String editeur,
			Integer age_minimum, Integer nb_chapite, String sensLecture) {
		super(nom, prix_achat, date_creation, auteur, nb_page, editeur, age_minimum, nb_chapite);
		SensLecture = sensLecture;
	}

	public Mangas() {
		// TODO Auto-generated constructor stub
	}
	
	

}
