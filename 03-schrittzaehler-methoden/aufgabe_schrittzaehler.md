# Java-Übungsaufgabe: Schrittzähler

**Themen:** Verzweigungen, Schleifen und Methoden  
**Bearbeitungszeit:** ca. 60–90 Minuten

## Aufgabenstellung

Entwickeln Sie ein Java-Programm, mit dem ein Benutzer seine täglich zurückgelegten Schritte erfassen und auswerten kann.

Das Programm soll über ein Menü gesteuert werden. Die einzelnen Funktionen sind durch Methoden ohne Rückgabewert (`void`) zu realisieren.

### 1. Hauptmenü

Das Programm soll ein Menü mit folgenden Optionen anzeigen:

```text
===== SCHRITTZÄHLER =====
1. Schritte erfassen
2. Tagesziel überprüfen
3. Programm beenden
```

Das Menü wird so lange angezeigt, bis der Benutzer das Programm beendet. Ungültige Menüeingaben sollen entsprechend behandelt werden.

### 2. Methode `schritteErfassen()`

Der Benutzer gibt zunächst an, für wie viele Tage (1 bis 7) er seine Schritte erfassen möchte. Anschließend werden die Schrittzahlen der einzelnen Tage abgefragt. Das Programm berechnet die Gesamtzahl der Schritte und gibt diese aus. Ungültige Eingaben, beispielsweise negative Schrittzahlen, müssen erneut abgefragt werden.

### 3. Methode `tageszielPruefen()`

Der Benutzer gibt seine aktuelle Schrittzahl ein. Das Programm überprüft, ob das Tagesziel von 10.000 Schritten erreicht wurde. Wurde das Ziel nicht erreicht, wird die Anzahl der fehlenden Schritte ausgegeben. Andernfalls wird angezeigt, um wie viele Schritte das Ziel übertroffen wurde.

### 4. Methode `main()`

Die `main()`-Methode übernimmt die Menüsteuerung und ruft abhängig von der Benutzerauswahl die entsprechenden Methoden auf.

## Vorgaben

* Verwenden Sie Verzweigungen (`if-else`, `switch`) und Schleifen (`for`, `while` oder `do-while`).
* Alle selbst erstellten Methoden besitzen den Rückgabetyp `void`.
* Verwenden Sie `Scanner` für die Benutzereingaben.
* Arrays sind nicht erforderlich.
