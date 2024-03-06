package entities.es1;

public class Rettangolo {
    private int base;
    private int altezza;

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int getBase() {
        return this.base;
    }

    public int getAltezza() {
        return this.altezza;
    }

    public int calcoloArea() {
        return this.base * this.altezza;
    }

    public int calcoloPerimetro() {
        return 2 * (this.base + this.altezza);
    }

    public static void stampaRettangolo(Rettangolo rettangolo) {
        int area = rettangolo.calcoloArea();
        int perimetro = rettangolo.calcoloPerimetro();
        System.out.println("Area del rettangolo: " + area);
        System.out.println("Perimetro del rettangolo: " + perimetro);
    }
}
