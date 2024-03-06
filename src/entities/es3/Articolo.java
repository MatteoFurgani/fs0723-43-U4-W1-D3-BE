package entities.es3;
import java.util.Random;

public class Articolo {
    private String codiceArticolo;
    private String descrizione;
    private int prezzo;
    private int numeroPezzi;


    public Articolo(String codiceArticolo, String descrizione, int prezzo, int numeroPezzi) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroPezzi = numeroPezzi;
    }


    public Articolo(String descrizione, int prezzo, int numeroPezzi) {
        this.codiceArticolo = generaCodiceArticoloCasuale();
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroPezzi = numeroPezzi;
    }


    private String generaCodiceArticoloCasuale() {
        Random rand = new Random();
        return "A" + (rand.nextInt(9999) + 1); // Genera un numero casuale tra 1 e 9999 e lo concatena con "A"
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public int getNumeroPezzi() {
        return numeroPezzi;
    }
}
