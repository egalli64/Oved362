package francesca;

public class S02 {
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
    public static double speed(double distance, double time) {
        if (time < 0.0)
            return 0.0;
        else
            return distance / time;
    }

    /**
     * Distance between (x0, y0) and (x1, y1)
     * 
     * @param x0 first point x
     * @param y0 first point y
     * @param x1 second point x
     * @param y1 second point y
     * @return distance
     */
    public static double distance(int x0, int y0, int x1, int y1) {
        // sqrt( (x1-x0)^2 + (y1-y0)^2 )
        return Math.sqrt(Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2));
    }

    /**
     * Engine capacity
     * 
     * @param bore   in mm
     * @param stroke in mm
     * @param nr     number of cylinders
     * @return the engine capacity in cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {
        // Cilindrata = (alesaggio/2)2*3.1416*corsa
        // alesaggio = bore ... * 0.001;

        return (Math.pow(bore / 2, 2) * Math.PI * stroke * nr) / 1000;
    }

    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {

        int total = 0;

        value = Math.abs(value);

        while (value != 0) {
            total = total + (value % 10);
            value = value / 10;
        }
        return total;

        /*
         * int temp = value; //boolean neg = false;
         * 
         * if(value < 0) { //neg = true; temp = temp * -1; }
         * 
         * String s = String.valueOf(value); //numero cifre contenute nel numero
         * 
         * sum += temp % 10; //estraggo ultima cifra for(int i = 1; i <= s.length();
         * i++) {
         * 
         * int t = temp / (int) Math.pow(10, i); sum += t % 10; System.out.println(sum);
         * }
         * 
         * return sum;
         */
    }

    // Soluzione Rocco
    public static int digitSum2(String value) {
        if (value == null || value.isEmpty()) {
            return 0;
        }

        // char[] temp = value.toCharArray();
        int result = 0;

        // for(char cur : valur.toCharArray())
        for (int i = 0; i < value.length(); i++) {
            int cipher = Character.getNumericValue(value.charAt(i));
            if (cipher > 0 && cipher <= 9)
                result += cipher;
        }
//  		Alternativa: rappresento char nella sua rappresentazione numerica
//    		char cur = value.charAt(i);
//    		if(cur > '0' && cur <= '9')
//    			result += cur - '0';

        return result;
    }

    /**
     * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
     *
     * @param x
     * @param y
     *
     * @return
     */
    public static int score(double x, double y) {

        int res;
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (distance < 10 && distance >= 5) {
            res = 1;
        } else if (distance < 5 && distance >= 1) {
            res = 5;
        } else if (distance < 1 && distance >= 0) {
            res = 10;
        } else {
            res = 0;
        }

        // res = (distance < 1) ? 10 : (distance < 5) ? 5 : (distance < 10) ? 1 : 0;

        return res;
    }
}
