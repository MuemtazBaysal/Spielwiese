import javax.naming.Name;
import javax.swing.*;
import java.sql.SQLOutput;

public class Spielwiese {
    public static void main(String[] args) {

        //Hallo und willkommen auf der Spielwiese von Mümtaz Baysal!
        //Hier habe ich zur Vorbereitung und Wiederholung einige Befehle ausprobiert.
        //Viel Spaß beim lesen!

        int [] Schrank = {1,2,3,4};
        System.out.println("Wert an Position 1: " + Schrank [0]);
        int laenge = Schrank.length;
        Schrank [0] = 10;
        System.out.println("Wert an Position 1: " + Schrank [0]);
        int variable1 = 10;
        int variable2 = 5;
        int Ergebnis;
        Ergebnis = variable1 + variable2;
        System.out.println("Das ergebnis von variable1 + variable2 =" + Ergebnis);
        String name = "Alex";
        byte alter = 25;
        int groese = 185;
        double gewicht = 90.85;
        char geschlecht = 'M';
        boolean arbeitet_hart;
        arbeitet_hart = true;
        System.out.println("Steckbrief");
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Groese: " + groese);
        System.out.println("Gewicht: " + gewicht);
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Alex arbeitet hart" + arbeitet_hart);
        int a = 5;
        int b = 10;
        boolean vergleich;
        vergleich = a != b;
        System.out.println(vergleich);
        if (a<b){
            System.out.println("Cool");
        }
        else {
            System.out.println("Nicht cool");
        }
        boolean lernen = true;
        boolean nichtstun = false;
        boolean guteNoten;
        guteNoten = lernen && nichtstun;
        System.out.println(guteNoten);

        int temperatur;
        temperatur = 2;

        if (temperatur == 0) {
            System.out.println("Trinke ich noch");
        }
        else if (temperatur <0) {
            System.out.println("Perfekt, her damit");
        }
            else {
            System.out.println("Nope, ich will ein kaltes Getränk");
        }
            switch (temperatur) {
                case 0:
                    System.out.println("Das Getraenk hat null Grad");
                    break;
                case 1:
                    System.out.println("Das Getraenk hat ein Grad");
                    break;
                case 2:
                    System.out.println("Das Getraenk hat 2 Grad");
                    break;
            }
            do {
                System.out.println(a + b);
                b--;
            }while (a<b);
        System.out.println("Einmal runterzaehlen");

        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.println("*");
            }
                System.out.println();

        }
    }
}
