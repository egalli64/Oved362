package stefano;

public class Voti {

    char trasforma(int x) {
        if (x <= 50) {
            return 'F';
        } else if (x > 50 && x <= 60) {
            return 'E';
        } else if (x > 60 && x <= 70) {
            return 'D';
        } else if (x > 70 && x <= 80) {
            return 'C';
        } else if (x > 80 && x <= 90) {
            return 'B';
        }

        else {
            return 'A';
        }
    }

}
