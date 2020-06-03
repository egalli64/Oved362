package stefano;

public class Media {

    double media(int[] vettore) {

        int i;
        double somma;

        somma = 0;

        for (i = 0; i <= vettore.length - 1; i = i + 1) {
            somma = somma + vettore[i];
        }

        return somma / vettore.length;

    }

}
