/* Copyright 2012 Hochschule Luzern - Technik & Architektur */

package choose;

/**
 * Klasse Selection für die Lernaufgabe zu switch.
 * @author Peter Sollberger
 */
public class Selection
{

    /**
     * Der Konstruktor von Selection ist "leer".
     */
    public Selection()
    {
    }

    /**
     * In Abhängigkeit des übergebenen Wertes erfolgt die 
     * Ausgabe eines Textes.
     */
    public void output(int value)
    {
        System.out.println("aktueller Parameter: " + value);

        switch (value)
        {
            case 1:
                System.out.println("eins");
            case 2:
                System.out.println("zwei");
            case 3:
                System.out.println("drei");
            default:
                System.out.println("anderer Wert");
        }
    }
}
