package m2ex;
import java.lang.Math;
public class S02 {
	
	
	 public static void main(String[] args) {
		 System.out.println("ciao");
		 System.out.println(distance(-3,-1,2,3));
		 System.out.println(digitSum(12));
		 System.out.println(digitSum1(12));
		// System.out.println(score(2,4));
	 }
	

    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
    public static double speed(double distance, double time) {
        if (time < 0.0) return 0.0;
        double result =  distance / time;
        return result;
    	
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
    public static double distance(int x0, int y0, double x1, double y1) {
    	
    	double x = Math.pow(x1 - x0, 2);
    	double y = Math.pow(y1 - y0, 2);
    	double distance = Math.sqrt(x + y);
    	
    	return distance;
    	
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
    	bore=bore/10;
    	stroke=stroke/10;
    	double unitCylinder = (Math.pow((bore/2), 2) * stroke * Math.PI);
        return nr * unitCylinder;
    }

    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum1(int value) {
    	if (value < 0) {
    		value = value * -1;
    	}
    	int result=0;
    	String s = Integer.toString(value);
    	int tmp;
    	for (int i = 0; i< s.length(); i++) {
    		tmp = (int) ((s.charAt(i)) - '0');
    		result = result + tmp;
    	}
    
        return result;
    }
    
    
    public static int digitSum(int value) {
    	if (value < 0) {
    		value = value * -1;
    	}
    	int i=0;
    	while(true) {
    		if (value < Math.pow(10, i)) {
    			break;
    		}else {
    			i++;
    		}
    	}
    	
    	int tmpValue=value;
    	int cifra;
    	int sum=0;
    	for (int j=i-1; j>= 0; j--) {
    		 cifra = (int) (tmpValue / Math.pow(10, j));
    		 tmpValue = tmpValue - (int)(cifra * Math.pow(10, j));
    		 sum = sum+cifra;
    	}	
        return sum;
    }  
    
    public static int digitSum3(int value) {
    	int total=0;
    	while(value != 0) {
    		total = total + (value % 10);
    		value = value / 10;
    	}
    	return 0;
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
        // TODO
    	double d = distance(0 ,0 ,x , y);
    	if(d <= 1) {
    		return 10;
    	} else if(d <= 5){
    		return 5;
    	} else if(d <= 10) {
    		return 1;
    	} else {
    		return 0;
    	}
        
    }
}
