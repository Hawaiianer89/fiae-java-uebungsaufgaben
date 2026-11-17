

import java.util.Scanner;

public class Fahrkartenautomat {
	public static void main(String[] args) {
		
//   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Wollen Sie ein Ticket kaufen?\n1 = Ja\n0 = Nein");
		int userAuswahl = scan.nextInt();

		
		// Zusatzaufgabe:
		//  hier ändern wenn Automat kein Wechselgeld hat:
		boolean automatHatWechselgeld = true;
		
//   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -		
		
		// Ticketauswahl so lange wie User nicht 0 drückt:
		while (userAuswahl != 0) {
			
			// Die Varieablen erst innerhalb der Schleife deklarieren und initialisieren
			// damit diese bei erneutem Ticketkauf wieder auf 0 gesetzt werden:
			double bereitsBezahlterBetrag = 0;
			double offenerBetrag = 0;
			double wechselGeld = 0;
			double ticketKosten = 0.0;
			double geldEinwerfen = 0;
			boolean abgebrochen = false;

			
			// Ticketauswahl anzeigen:
			System.out.println("\u001B[4mBitte Fahrkarte auswählen:\u001B[0m" + 
						       "\n1 -> Kurzstrecke: 2,00 €" +
							   "\n2 -> Einzelfahrt: 3,50 €" +
							   "\n3 -> Tageskarte:  9,00 €");

//   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
			
			// Ticketabfrage:
					
/*
 * switch-case	-> welches Ticket wurde gekauft
 * boolean		-> wurde ein Ticket gekauft
 * while		-> schaut auf den boolean -> war die Eingabe korrekt -> weiter zum bezahlen
 * 
 * ohne den boolean würde der code bei falscher Eingabe einfach weiter laufen.
 * -> Kaufprozess würde ohne gültiges Ticket durchgespielt werden!
 */
			
			// Eingabe auf false setzen:
			// wenn User gültiges Ticket -> true
			boolean gueltigeEingabe = false;
			
			
			// so lange bis eine gültige Eingabe kommt:
			while (!gueltigeEingabe) {
				int fahrkartenauswahl = scan.nextInt();
				
				switch (fahrkartenauswahl) {
					case 1:
						System.out.println("\nKurzstrecke ausgewählt:\nPreis:  2,00 €\n");
						ticketKosten = 2;
						gueltigeEingabe = true;
						break;
						
					case 2:
						System.out.println("\nEinzelfahrt ausgewählt:\nPreis:  3,50 €\n");
						ticketKosten = 3.5;
						gueltigeEingabe = true;
						break;
						
					case 3:	
						System.out.println("\nTageskarte ausgewählt: \nPreis: 9,00 €\n");
						ticketKosten = 9.0;
						gueltigeEingabe = true;
						break;
						
					default:
						System.out.println("\nUngültige Eingabe! Try again!");
						break;
				}	
			}
				
//   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
				
					// Bezahlvorgang:
			
			// Ticketpreis als offener Betrag:
			offenerBetrag = ticketKosten;

			System.out.println("\nAutomat akzeptiert nur 0,50 €, 1,00 € und 2,00 € Münzen!\n");
			
			// wenn kein Wechselgeld: Info
			if (automatHatWechselgeld == false) {
				System.out.println("Kein Wechselgeld vorhanden: Bitte passend bezahlen!");
			}

			do {
				System.out.println("Bitte Geld einwerfen:"  +
								   "\nbereits eingezahlt: " + bereitsBezahlterBetrag + " €" +
								   "\noffener Betrag: " 	+ offenerBetrag 		 + " €" +
								   "\n0 -> abbrechen:");
				geldEinwerfen = scan.nextDouble();

				// Abbruch mit 0:
				if (geldEinwerfen == 0) {
					System.out.println("\nKauf abgebrochen. Rückgabe: " + bereitsBezahlterBetrag + " €");
					abgebrochen = true;
					// break verlässt die do-while Schleife:
					break;
				}

				// falsche Münze ablehnen:
				if (geldEinwerfen != 0.5 && geldEinwerfen != 1 && geldEinwerfen != 2) {
					System.out.println("Fehler! Nur 0,50 €, 1,00 € und 2,00 € Münzen erlaubt.");
					System.out.println("Nicht akzeptierte " + geldEinwerfen + " € Münze wird zurückgegeben");
					// continue springt zur Schleifenbedingung -> nächste Eingabe
					continue;
				}

				// Zusatzaufgabe: 
				//  Münze größer als offener Betrag -> zurückweisen
				if (automatHatWechselgeld == false && geldEinwerfen > offenerBetrag) {
					System.out.println("Bitte passend zahlen! " + geldEinwerfen + " € Münze wird zurückgegeben");
					continue;
				}

				// gültige Münze verrechnen:
				bereitsBezahlterBetrag += geldEinwerfen;
				offenerBetrag = ticketKosten - bereitsBezahlterBetrag;

			} while (offenerBetrag > 0);

			// Zusammenfassung bei abgeschlossenem Kauf:
			if (abgebrochen == false) {
				wechselGeld = bereitsBezahlterBetrag - ticketKosten;
				System.out.println("\nKaufbeleg:" +
						"\nTicketpreis: "	  + ticketKosten 		   + " €" +
						"\nBezahlt: " 		  + bereitsBezahlterBetrag + " €" +
						"\nIhr Wechselgeld: " + wechselGeld 		   + " €");
			}

			// wer hat Lust auf noch eine Runde:
			System.out.println("\nWollen Sie ein Ticket kaufen?\n1 = Ja\n0 = Nein");
			userAuswahl = scan.nextInt();
		}

		System.out.println("Vielen Dank für Ihren Besuch!");
		scan.close();
	}
}




