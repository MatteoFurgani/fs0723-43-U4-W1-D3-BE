package entities.es2;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim("3478928937");
        sim.aggiungiCredito(50.0);
        sim.effettuaChiamata("3849037671", 15);
        sim.effettuaChiamata("3407855102", 25);

        sim.stampaDatiSim();
    }
}
