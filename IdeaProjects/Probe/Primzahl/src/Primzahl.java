public class Primzahl {
    public static void main(String[] args) {

        //Hallo und willkomemen zu meinem Programm, welches Primzahlen ausgibt!
        //Ich habe das als Vorbereitung geschrieben gehabt und bin froh, es Ihnen präsentieren zu dürfen.

        int n = 20;


        for (int i = 1; i <= n; i++) {

            boolean isPrimzahl = true;

            for (int j = 2; j < i; j++) {

                if ((i % j) == 0) {
                    isPrimzahl = false;
                }
            }

            if (isPrimzahl) {
                System.out.println(i);

                //Nun das war mein Programm, welches Primzahlen ausgibt.
                //Ich habe am Anfang überlegt wie ich dies angehen soll und habe an einfache Rechenoperationen gedacht.
                //Mit Hilfe des Internets bin ich dann auf die Idee gekommen, es mit Schleifen auszuprobieren.
                //Ich habe mein Programm geschrieben und anschließend mit Hilfe des internets verbessert.
        }
}
}

}
