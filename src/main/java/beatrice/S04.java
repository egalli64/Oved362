package beatrice;

// import java.util.*;
// import java.lang.Math.*;

public class S04 {
    // SOMMA
    /**
     * Add up all the numbers in the passed closed interval
     * 
     * @param first the left limit
     * @param last  the right limit
     * @return the sum of all the numbers, or zero
     */
    public static long sum(int first, int last) {
        int total = 0;
        while (first <= last) {
            total += first;
            first++;
        }
        return total;
    }

//  //PROVA SOMMA
//  public static void main(String[] args) {
//      int first = 1;
//      int last = 5;
//      System.out.println(sum(first, last));
//  }

    // SOMMA II version - in that version first and last could be inverted ->
    // ovviamente il test sumEmpty da errore
    /**
     * Add up all the numbers in the passed closed interval
     * 
     * @param first the left limit
     * @param last  the right limit
     * @return the sum of all the numbers, or zero
     */
    public static long sum_second_version(int first, int last) {
        int total = 0;
        if (first > last) {
            int temp1 = last;
            int temp2 = first;
            while (temp1 <= temp2) {
                total += temp1;
                temp1++;
            }
            return total;
        }
        while (first <= last) {
            total += first;
            first++;
        }
        return total;
    }

//	//PROVA SOMMA
//	public static void main(String[] args) {
//	    int first = 4;
//	    int last = 1;
//	    System.out.println(sum(first, last));
//	}

    // PARI
    /**
     * Add up only the even numbers in the passed closed interval
     * 
     * @param first the left limit
     * @param last  the right limit
     * @return the sum of all the even numbers, or zero
     */
    public static long evenSum(int first, int last) {
        int temp = first;
        int total = 0;
        while (temp <= last) {
            if (temp % 2 == 0) {
                total += temp;
            }
            total += 0;
            temp++;
        }
        return total;
    }

//  //PROVA SOMMA DI PARI
//  public static void main(String[] args) {
//      int first = 10;
//      int last = 4;
//      System.out.println(evenSum(first, last));
//  }

    // SQRT NEWTON
    /**
     * Square root using Newton method Epsilon should be set to 0.001
     * 
     * @param value
     * @return calculated square root
     */
    public static double sqrt(double value) {
        double x_0 = value / 2;
        double x_1 = (x_0 + value / x_0) / 2;
        double delta = Math.abs(x_1 - x_0);
        while (delta > 0.001) {
            x_0 = x_1;
            x_1 = (x_1 + value / x_1) / 2;
            delta = Math.abs(x_1 - x_0);
        }
        return x_1;
    }

//	//PROVA SQRT
//	public static void main(String[] args) {
//	    double value = 5;
//	    System.out.println(sqrt(value));
//	}

    // SQRT - II version
    /**
     * Square root using Newton method
     * 
     * @param value
     * @param epsilon stop iterating when gain is less than this value
     * @return calculated square root
     */
    public static double sqrt(double value, double epsilon) {
        double x_0 = value / 2;
        double x_1 = (x_0 + value / x_0) / 2;
        double delta = Math.abs(x_1 - x_0);
        while (delta > epsilon) {
            x_0 = x_1;
            x_1 = (x_1 + value / x_1) / 2;
            delta = Math.abs(x_1 - x_0);
        }
        return x_1;
    }
//  public static void main(String[] args) {
//  System.out.println(sqrt(81,0.001));
//}

    /**
     * Factorial
     * 
     * @param value
     * @return factorial of input value, or zero
     */
    public static long factorial(int value) {
        if (value < 0) {
            return 0;
        }
        int result = 1;
        while (value > 0) {
            result *= value;
            value--;
        }
        return result;
    }
//  //PROVA FACTORIAL
//  public static void main(String[] args) {
//      int value = -4;
//      System.out.println(factorial(value));
//  }

    /**
     * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
     * 
     * @param value
     * @return the Fibonacci number of value, or zero
     */
    public static long fibonacci(int value) {
        int primo_addendo = 0;
        int secondo_addendo = 1;
        int somma_fibo = 0;
        while (secondo_addendo < value) {
            somma_fibo = primo_addendo + secondo_addendo;
            primo_addendo=secondo_addendo;
            secondo_addendo = somma_fibo;
        }
        if (secondo_addendo == value) {
            return secondo_addendo;
        }
        else {
            return 0;
        }
    }
//    //PROVA FIBONACCI
//    public static void main(String[] args) {
//        System.out.println(fibonacci(8));
//    }

    // MOLTIPLICATION TABLE
    /**
     * Multiplication table
     * 
     * @param value
     * @return The multiplication table for value, when possible
     */
    public static int[][] multiplicationTable(int value) {
        int[][] result = new int[value][value];
        for (int i = 0; i<value; i++) {
            for (int j=0; j<value; j++) {
                result[i][j]=(i+1)*(j+1);
            }
        }
        return result;
    }
//    // PROVA TAVOLA
//    public static void main(String[] args) {
//        System.out.println(Arrays.deepToString(multiplicationTable(5)));
//    }
}