


import java.util.Scanner;


public class GetraenkeautomatUndDasRueckgeld {
	public static void main(String[] args) {
		
// ====================================================================================================================\\	
		
		// Variablen deklarieren und initialisieren:
		Scanner scan = new Scanner(System.in);
		boolean kannWeiterhinAuszahlen = true;
		int rueckgeldBetrag = 0;
		
		// Arrays erstellen mit Münzwert und Anzahl:
		int [] muenzWertImAutomat   = {200, 100, 50, 20, 10, 5};
		int [] muenzAnzahlImAutomat = {  1,   1,  0,  3,  2, 4};
		
// ====================================================================================================================\\			
		
		// Nutzer so lange auffordern bis positive Ganzzahl:
		do {
			System.out.println("Bitte Rückgeldbetrag in cent angeben:");
			rueckgeldBetrag = scan.nextInt();
	  } while (rueckgeldBetrag <= 0);
		
// ====================================================================================================================\\		
		
		do {	// } while (kannWeiterhinAuszahlen == true)
			
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -	
			
			// jeden Münzwert im Automaten durchgehen:
			for (int i = 0; i < muenzWertImAutomat.length; i++) {
				
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -	
				
				// Wenn 0 Münzen vom muenzWert ODER 
				// aktuelle Münze größer Rückgeldbetrag ->
				// direkt zur nächsten Münze:
				if (muenzAnzahlImAutomat[i] == 0 || rueckgeldBetrag < muenzWertImAutomat[i]) {
					if (i == muenzWertImAutomat.length -1) {
						kannWeiterhinAuszahlen = false;
						// Schleife beenden:
						break;
					}
					// springt zum SchleifenKopf -> i++
					continue;
				}		
				
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -	
				
				// RückgeldBetrag GRÖßER aktuellerMünzWert && muenzAnzahlImAutomat NICHT 0:
				if (rueckgeldBetrag >= muenzWertImAutomat[i] && muenzAnzahlImAutomat[i] != 0) {
					rueckgeldBetrag = rueckgeldBetrag - muenzWertImAutomat[i];
					muenzAnzahlImAutomat[i] --;
					System.out.println("Münze ausgegeben: " + muenzWertImAutomat[i] + " cent Münze");
				}
				
				// wenn rueckgeldBetrag exakt 0:
				if (rueckgeldBetrag == 0) {
					System.out.println("\n\u001B[4mAutomat kann passend rausgeben.\u001B[0m");
					kannWeiterhinAuszahlen = false;
					// Schleife abbrechen:
					break;
				}
		        
				// i um eins verringern -> prüfen ob der gleiche muenzWert
				// nochmal passt wenn vorhanden:
				i --;
				
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
				
			// Ende For-Schleife (36)
			}
			
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
			
			// Wenn Automat nicht passend/auf 0 rausgeben kann:
			if (kannWeiterhinAuszahlen == false && rueckgeldBetrag != 0) {
				System.out.println("\n\u001B[4mAutomat kann NICHT passend ausgeben.\u001B[0m \nNoch offener Betrag: " + rueckgeldBetrag + " cent.");
				break;
			}
			
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
			
		// do-while (31)
		} while (kannWeiterhinAuszahlen == true);
			
// ====================================================================================================================\\	
		
		System.out.println("\nVielen Dank und schönen Tag!\n");
		
		
		// Restmünzen im Automat:
		for (int a = 0; a < muenzWertImAutomat.length; a++) {
			System.out.println("noch " + muenzAnzahlImAutomat[a] + " x " + muenzWertImAutomat[a] + " cent Münzen im Automat");
		}
		
		
		scan.close();
	
	}
}


