# Aufgabe: Der Getränkeautomat und das Rückgeld

Ein Getränkeautomat muss nach einem Kauf **Rückgeld** auszahlen. Im Münzfach befinden sich jedoch nur begrenzte Mengen:

| Münzwert | Anzahl |
| :--- | :--- |
| 200 Cent | 1 |
| 100 Cent | 1 |
| 50 Cent | 0 |
| 20 Cent | 3 |
| 10 Cent | 2 |
| 5 Cent | 4 |

Entwickeln Sie ein Java-Programm, das einen vom Benutzer eingegebenen **Rückgeldbetrag in Cent** mit den vorhandenen Münzen zusammenstellt.

Dabei gelten folgende Anforderungen:

* **Verwenden Sie bevorzugt die größte verfügbare Münze, die den noch offenen Betrag nicht überschreitet.**
* Jede ausgegebene Münze verringert den Bestand im Münzfach.
* Geben Sie aus, wie viele Münzen jedes Münzwerts benötigt werden.
* Kann der Betrag nicht vollständig ausgezahlt werden, muss das Programm dies erkennen und den noch fehlenden Betrag nennen.

Sie dürfen von einer nicht negativen, ganzzahligen Eingabe ausgehen.

Prüfen Sie Ihr Programm unter anderem mit **170, 185, 400 und 430 Cent**. Beginnen Sie jeden Test mit dem ursprünglichen Münzbestand.

