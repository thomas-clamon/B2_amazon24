package b2_AMAZON;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		BD bd1 = new BD("Boule et bile", 10F, LocalDate.of(1950,1, 1), "Jean Robin", 50, "DUPUY", 6, 10, 500);
		
		Mangas m1 = new Mangas();
		m1.setPrix_achat(20F);
		m1.setNb_page(60);
		
		System.out.println(m1.marge());

	}

}
