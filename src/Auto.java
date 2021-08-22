/**
 * Eine Klasse für Autos
 * @author Christoph Lottersberger
 * @version 1.0.0
 * @since 17.08.2021
 */

//einzeiliger Kommentar

/**
 * mehrzeiliger Kommentar
 */

// IntelliJ IDEA
// Strg + Umschalt + K - Zeile löschen
// Alt + Up - Zeile rauf verschieben
// Alt + Down - Zeile runter verschieben
// Strg + Ende - Ende des Codes
// Strg + Pos1 - Anfang des Codes
// F2 - Umbenennen
// /** - JavaDoc vor Methode/Konstruktor
// Strg + K, Strg + C - Kommentar aktivieren
// Strg + K, Strg + U - Kommentar deaktivieren
// Strg + L - mehrere Zeilen auswählen
// Strg + U - weniger Zeilen auswählen
// Umschalt + Alt + A - Mehrzeiliger Kommentar aktivieren
// Umschalt + Alt + A - Mehrzeiliger Kommentar deaktivieren
// Strg + Umschalt + P - Zeige alle Befehle

// UML

/*
 * @startuml skinparam backgroundColor #EEEBDC skinparam handwritten true actor
 * Customer Customer -> "login()" : username & password "login()" -> Customer :
 * session token activate "login()" Customer -> "placeOrder()" : session token,
 * order info "placeOrder()" -> Customer : ok Customer -> "logout()" "logout()"
 * -> Customer : ok deactivate "login()"
 * 
 * @enduml
 */

// Strg + Alt + G - Generate (funktioniert nicht richtig)

// Refactoring
// F2 - Umbenennen
// Strg + Umschalt + R - Refactoring

// Formatierung
// Umschalt + Alt + F - Formatierung

// Inspektionen
// ????????

//JavaDoc
//JavaDoc exportieren funktioniert nicht

// Klasse

public class Auto {

    // Eigenschaften/Datenfelder

    private int preis;
    private int reifen;
    private int tueren;
    private int ps;

    // Konstruktoren

    /**
     *
     * @param preis  - der Preis
     * @param reifen - die Reifen
     * @param tueren - die Türenanzahl
     * @param ps     - die Pferdestärke
     */

    public Auto(int preis, int reifen, int tueren, int ps) {
        this.preis = preis;
        this.reifen = reifen;
        this.tueren = tueren;
        this.ps = ps;
    }

    // Methoden

    /**
     *
     * @return - Gibt den Preis zurück
     */
    public int getPreis() {
        return preis;
    }

    /**
     *
     * @param preis - Setzt den Preis
     */
    public void setPreis(int preis) {
        this.preis = preis;
    }

    /**
     *
     * @return - Gibt die Reifenanzahl zurück
     */
    public int getReifen() {
        return reifen;
    }

    /**
     *
     * @param reifen - Setzt die Reifenanzahl
     */
    public void setReifen(int reifen) {
        this.reifen = reifen;
    }

    /**
     *
     * @return - Gibt die Türenanzahl zurück
     */
    public int getTueren() {
        return tueren;
    }

    /**
     *
     * @param tueren - Setzt die Türenanzahl
     */
    public void setTueren(int tueren) {
        this.tueren = tueren;
    }

    /**
     *
     * @return - Gibt die Pferdestärke zurück
     */
    public int getPs() {
        return ps;
    }

    /**
     *
     * @param ps - Setzt die Pferdestärke
     */
    public void setPs(int ps) {
        this.ps = ps;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Auto{" + "preis=" + preis + ", reifen=" + reifen + ", tueren=" + tueren + ", ps=" + ps + '}';
    }
}
