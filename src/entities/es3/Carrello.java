package entities.es3;

public class Carrello {
    private Cliente clienteAssociato;
    private Articolo[] elencoArticoli;
    private double totaleCostoArticoli;
    private int numArticoli;

    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new Articolo[10]; // Supponiamo di poter aggiungere fino a 10 articoli
        this.totaleCostoArticoli = 0.0;
        this.numArticoli = 0;
    }

    public void aggiungiArticolo(Articolo articolo) {
        if (numArticoli < 10) {
            elencoArticoli[numArticoli++] = articolo;
            totaleCostoArticoli += articolo.getPrezzo();
        } else {
            System.out.println("Limite di articoli nel carrello raggiunto");
        }
    }

    public Cliente getClienteAssociato() {
        return clienteAssociato;
    }

    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }

    public double getTotaleCostoArticoli() {
        return totaleCostoArticoli;
    }
}
