package entities.es1;

public class Main {
    public static void main(String[] args) {
        Rettangolo uno = new Rettangolo(5,10);
        Rettangolo due = new Rettangolo(2,8);

        //System.out.println("La base del rettangolo è " + uno.getBase() + " e l'altezza è " + uno.getAltezza());
        //System.out.println("L'area del rettangolo è " + uno.calcoloArea());
        //System.out.println("Il perimetro del rettangolo è " + uno.calcoloPerimetro());
        //System.out.println("La base del rettangolo è " + due.getBase() + " e l'altezza è " + due.getAltezza());
        //System.out.println("L'area del rettangolo è " + due.calcoloArea());
        //System.out.println("Il perimetro del rettangolo è " + due.calcoloPerimetro());
        System.out.println("Rettangolo uno:");
        Rettangolo.stampaRettangolo(uno);
        System.out.println("Rettangolo due:");
        Rettangolo.stampaRettangolo(due);
    }
}
