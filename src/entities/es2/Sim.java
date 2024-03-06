package entities.es2;
import java.util.Arrays;

public class Sim {
    private final String numeroTelefono;
    private double creditoDisponibile;
    private Chiamata[] ultimeChiamate;
    private int numeroChiamate;

    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0.0;
        this.ultimeChiamate = new Chiamata[5];
        this.numeroChiamate = 0;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }

    public Chiamata[] getUltimeChiamate() {
        return ultimeChiamate;
    }

    public void aggiungiCredito(double credito) {
        this.creditoDisponibile += credito;
    }

    public void effettuaChiamata(String numeroChiamato, int durataMinuti) {
        if (creditoDisponibile >= durataMinuti * 0.1) {
            creditoDisponibile -= durataMinuti * 0.1;
            if (numeroChiamate < 5) {
                ultimeChiamate[numeroChiamate++] = new Chiamata(numeroChiamato, durataMinuti);
            } else {
                for (int i = 0; i < 4; i++) {
                    ultimeChiamate[i] = ultimeChiamate[i + 1];
                }
                ultimeChiamate[4] = new Chiamata(numeroChiamato, durataMinuti);
            }
            System.out.println("Chiamata effettuata a " + numeroChiamato + ", durata: " + durataMinuti + " minuti");
        } else {
            System.out.println("Credito insufficiente per effettuare la chiamata");
        }
    }

    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + creditoDisponibile + " euro");
        System.out.println("Ultime chiamate effettuate:");
        for (Chiamata chiamata : ultimeChiamate) {
            if (chiamata != null) {
                System.out.println("Numero chiamato: " + chiamata.getNumeroChiamato() + ", Durata: " + chiamata.getDurataMinuti() + " minuti");
            }
        }
    }
}
