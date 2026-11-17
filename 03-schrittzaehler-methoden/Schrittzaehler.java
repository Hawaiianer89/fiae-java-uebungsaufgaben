



import java.util.Scanner;

//=====================================================================================================================

public class Schrittzähler {
	
//=====================================================================================================================	
	
	// kleine Hilfsmethode um zu prüfen ob auch wirklich eine Zahl eingegeben wurde:
	public static int checkeObUserEingabeAuchWirklichEineZahlIst() {
		// hasNext() prüft ob die Eingabe auch wirklich den gewünschten Datentyp entspicht:
		while (!scan.hasNextInt()) {
			System.out.println("Ungültige Eingabe! Nur GanzZahlen erlaubt!");
			// Text aus Scanner entfernen:
			scan.nextLine();
		}
		// Eingabepuffer in Variable speichern:
		int userEingabe = scan.nextInt();
		// überflüssiges \n entfernen!!!
		scan.nextLine();
		return userEingabe;
	}
	
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -	
	
	// Variablen deklarieren/initialisieren:
	// static -> gehört zur Klasse -> kann überall aufgerufen werden:
	// scan wird in allen Methoden benötigt:
	// menueEingabe auch doppelt verwendet
	static Scanner scan = new Scanner(System.in);
	static int menueEingabe;
	
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
	
	public static void menue() {
		System.out.println("==== SCHRITTZÄHLER ====" + 
						   "\n1. Schritte erfassen" + 
						   "\n2. Tagesziel überprüfen" + 
						   "\n3. Programm beenden");
		
		
		// So lange eingeben bis Eingabe korrekt:
		do {
			
			// Hilfsmethode -> siehe oben:
			// Eingabe wird mit Methode geprüft -> wenn Prpfung bestanden -> speichern in Variable:
			menueEingabe = checkeObUserEingabeAuchWirklichEineZahlIst();
			
			// wenn Eingabe NICHT 1, 2 oder 3:
			if (menueEingabe != 1 && menueEingabe != 2 && menueEingabe != 3) {
				System.out.println("Ungültige Eingabe!");
			}
			
			// Programm beenden bei 3:
			if (menueEingabe == 3) {
				System.out.println("Programm beendet!");
				// Schleife und Methode beenden:
				return;
			}
			
		// so lange eingeben bis korrekte Einabe erfolgt -> 1 oder 2:
		} while(menueEingabe != 1 && menueEingabe != 2);
	}
	
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
	
	public static void schritteErfassen() {
		// Variablen deklarieren/initialisieren:
		int tage;
		int schrittEingabe;
		int summeSchritte = 0;
		
		
		// Tage erfassen:
		do {	
			// So lange Fragen bis Eingabe korrekt:
			System.out.println("Für wie viele Tage wollen Sie Schritte erfassen? (1 - 7)");
			tage = checkeObUserEingabeAuchWirklichEineZahlIst();
			
			// nur Tage 1 - 7 erlauben:
			if (tage < 1 || tage > 7) {
				System.out.println("Fehler! Nur Tage 1 - 7 erlaubt!");
			}
		// so lange Eingeben bis Eingabe zwischen 1 und 7:
		}while(tage < 1 || tage > 7);

		// 
		for (int i = 0; i < tage; i++) {
			System.out.println("Bitte Schritte für Tag " + (i + 1) + " eingeben: ");
			// HilfsMethode -> siehe oben:
			schrittEingabe = checkeObUserEingabeAuchWirklichEineZahlIst();
			
			// wenn negative Zahl:
			if (schrittEingabe < 0) {
				System.out.println("Fehler! Nur positive Ganzzahlen erlaubt! Nochmal eingeben:");
				
				// so lange wiederholen bis positive Ganzzahl:
				do {
					schrittEingabe = checkeObUserEingabeAuchWirklichEineZahlIst();
				}while (schrittEingabe < 0);
			}
			
			
			// Schritte summieren:
			summeSchritte += schrittEingabe;
		}
	
		
	System.out.println("Gesamtanzahl Schritte: " + summeSchritte);
	}
	
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
	
	public static void tageszielPruefen() {
		// Variablen deklarieren/initialisieren:
		int tagesZiel = 10000;
		int aktuelleSchritte;
		
		
		do {
			System.out.println("Bitte aktuelle Schrittzahl eingeben: ");
			aktuelleSchritte = checkeObUserEingabeAuchWirklichEineZahlIst();
			
			// keine negativZahl erlauben:
			if (aktuelleSchritte < 0) {
				System.out.println("Fehler! Nur positive Ganzzahlen erlaubt! Nochmal eingeben:");
			}
		}while(aktuelleSchritte < 0);
		
		
		int differenzTagesZiel = tagesZiel - aktuelleSchritte;
		
		// Tagesziel nicht erreicht: 
		if (tagesZiel - aktuelleSchritte > 0) {
			System.out.println("Tagesziel leider noch nicht erreicht!\nNoch fehlende Schritte: " + differenzTagesZiel);
			
		// Über das Ziel hinaus:
		}else if (tagesZiel - aktuelleSchritte < 0) {	
			
			// aktuell ist differenzTagesZiel eine NegativZahl -> das negieren wir mit dem - davor:
			System.out.println("Tagesziel erreicht!\nzusätzlich gemachte Schritte: " + -differenzTagesZiel);
			
		// Genau 10.000:
		} else {
			System.out.println("Punktlandung! Exakt " + differenzTagesZiel + " Schritte vom Tagesziel entfernt");
		}
	}

//=====================================================================================================================
	
	public static void main(String[] args) {

//=====================================================================================================================
		
		do {
			
			menue();
			
			switch (menueEingabe) {
				case 1:
					schritteErfassen();
					break;
				case 2:
					tageszielPruefen();
					break;
					
				// default brauchen wir hier glaube ich nicht -> 
				// AbbruchBedingung schon in der Methode festgelegt!
			}	
			
		}while (menueEingabe == 1 || menueEingabe == 2);
		
		
	}
}

