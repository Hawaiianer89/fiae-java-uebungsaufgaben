# Aufgabe: Fahrkartenautomat

Entwickeln Sie ein Java-Programm, das einen einfachen Fahrkartenautomaten simuliert.

Der Kunde wählt eine Fahrkarte aus:

| Fahrkarte | Preis |
| :--- | :--- |
| Kurzstrecke | 2,00 € |
| Einzelfahrt | 3,50 € |
| Tageskarte | 9,00 € |

Anschließend zahlt der Kunde durch wiederholte Eingabe von Geldbeträgen. Der Automat akzeptiert ausschließlich **0,50 €, 1,00 € und 2,00 €**. Andere Beträge werden zurückgewiesen und dürfen den eingezahlten Betrag nicht verändern.

Nach jedem Einwurf soll erkennbar sein, wie viel Geld noch fehlt. Sobald ausreichend bezahlt wurde, gibt der Automat die Fahrkarte und gegebenenfalls das Rückgeld aus.

Der Kunde darf den Kauf während der Bezahlung durch die Eingabe von `0` abbrechen. Bereits eingezahltes Geld wird vollständig zurückgegeben.

Nach einem abgeschlossenen oder abgebrochenen Kauf kann ein weiterer Kunde eine Fahrkarte kaufen. Erst auf Wunsch wird das Programm beendet.

## Zusatzaufgabe – Nur passende Bezahlung

Erweitern Sie den Fahrkartenautomaten um einen Modus, in dem **kein Rückgeld ausgegeben werden kann**.

Der Kunde muss den Fahrpreis mit den akzeptierten Münzen exakt bezahlen. Würde eine Münze den noch offenen Betrag überschreiten, wird sie zurückgewiesen und nicht zum eingezahlten Betrag addiert.

Der Kaufabschluss erfolgt erst, wenn der eingezahlte Betrag genau dem Fahrpreis entspricht. Ein Abbruch mit `0` muss weiterhin möglich sein; bereits eingezahltes Geld wird dabei vollständig zurückgegeben.
