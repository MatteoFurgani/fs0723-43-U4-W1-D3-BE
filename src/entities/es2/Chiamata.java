package entities.es2;

public class Chiamata {
    private String numeroChiamato;
    private int durataMinuti;

    public Chiamata(String numeroChiamato, int durataMinuti) {
        this.numeroChiamato = numeroChiamato;
        this.durataMinuti = durataMinuti;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    public int getDurataMinuti() {
        return durataMinuti;
    }

}
