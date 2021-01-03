package facebook;

import java.util.List;

public class FacebookAccount {

	private String nume;
	private int varsta;
	private String locatie;
	private List prieteni;

	public FacebookAccount(String nume, int varsta, String locatie, List<String> lista) {
		this.nume = nume;
		this.varsta = varsta;
		this.locatie = locatie;
		this.prieteni = lista;

	}
}
