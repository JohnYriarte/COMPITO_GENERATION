package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	// Metodo per controllare Matricola
	public static void controlloMatricola(ArrayList<Studente> studenti, Studente nuovoStudente) {
		for (Studente studente : studenti) {
			if (studente.getMatricola() == nuovoStudente.getMatricola()) {
				System.out.println("Matricola gia esistente");
				return;
			}
		}
		System.out.println("Studente e' stato aggiunto!");
		studenti.add(nuovoStudente);
	}

	// Metodo per stampare gli studenti
	public static void stampaStudenti(ArrayList<Studente> studenti) {
		if (studenti.size() == 0) {
			System.out.println("Non ci sono studenti, considera di aggiungerne uno");
			return;
		}
		for (Studente studente : studenti) {
			studente.profilo();
		}
	}

	// Metodo per stampare il Menu
	public static void stampaMenu() {
		System.out.println("1) Aggiungere uno studente");
		System.out.println("2) Visualizzare studenti");
		System.out.println("3) Cercare uno studente tramite matricola");
		System.out.println("4) Uscire");
	}
	
	// Metodo per cercare studente
	public static void cercareStudente(ArrayList<Studente> studenti, int matricola) {
		for (Studente studente : studenti) {
			if (studente.getMatricola() == matricola) {
				System.out.println("Studente trovato");
				studente.profilo();
				return;
			}
		}
		
		System.out.println("Studente non trovato");
	}

	public static void main(String[] args) {

		ArrayList<Studente> studenti = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		int scelta = -1;

		// LOOP MENU
		while (true) {

			// Exit MENU
			if (scelta == 4) {
				System.out.println("Arrivederci");
				break;
			}
			stampaMenu();
			scelta = scanner.nextInt();
			scanner.nextLine();
			switch (scelta) {
			case 1:
				// Aggiungere uno studente
				System.out.println("Nome studente: ");
				String nome = scanner.nextLine();
				System.out.println("Cognome studente: ");
				String cognome = scanner.nextLine();
				System.out.println("Matricola studente: ");
				int matricola = scanner.nextInt();
				Studente nuovoStudente = new Studente(nome, cognome, matricola);
				controlloMatricola(studenti, nuovoStudente);
				break;
			case 2:
				// Visualizzare studenti
				stampaStudenti(studenti);
				break;
			case 3:
				// Cercare studente
				System.out.println("Inserire matricola studente:  ");
				int nuovaMatricola = scanner.nextInt();
				cercareStudente(studenti, nuovaMatricola);
				break;

			}
		}

	}

}
