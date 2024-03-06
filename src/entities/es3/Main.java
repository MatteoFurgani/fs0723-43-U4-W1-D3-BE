package entities.es3;

public class Main {
    public static void main(String[] args) {

        Articolo articolo1 = new Articolo("Playstation5", 550, 1);


        Cliente cliente1 = new Cliente("C001", "Mario Rossi", "mario@email.com", "2024-03-07");



        Carrello carrelloCliente1 = new Carrello(cliente1);


        carrelloCliente1.aggiungiArticolo(articolo1);


        System.out.println("Cliente: " + carrelloCliente1.getClienteAssociato().getNomeCognome());
        System.out.println("Data iscrizione: " + carrelloCliente1.getClienteAssociato().getDataIscrizione());
        System.out.println("Email: " + carrelloCliente1.getClienteAssociato().getEmail());
        System.out.println("Totale costo articoli nel carrello: " + carrelloCliente1.getTotaleCostoArticoli() + " euro");
        System.out.println("Elenco articoli nel carrello:");
        for (Articolo articolo : carrelloCliente1.getElencoArticoli()) {
            if (articolo != null) {
                System.out.println("- " + articolo.getDescrizione() + ", Prezzo: " + articolo.getPrezzo() + " euro");
            }
        }

    }
    }

