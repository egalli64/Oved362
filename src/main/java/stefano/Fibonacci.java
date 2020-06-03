package stefano;

public class Fibonacci {

    long fibonacci(long i) {

        if (i == 0)
            return 0;
        else if (i == 1)
            return 1;
        else
            return fibonacci(i - 1) + fibonacci(i - 2);

    }

}
