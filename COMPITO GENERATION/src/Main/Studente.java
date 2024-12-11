package Main;

public class Studente {
	// Attributes
	
	protected String nome;
	protected String cognome;
	protected int matricola;
	
	// Constructor
	Studente(String nome, String cognome, int matricola) {
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}
	
	
	// Methods
	
	// Metodo per ritornare matricola
	public int getMatricola() {
		return this.matricola;
	}
	
	// Metodo per stampare profilo
	public void profilo() {
		System.out.println(String.format("Studente %s %s - (%d)", this.nome, this.cognome, this.matricola));
	}
}
