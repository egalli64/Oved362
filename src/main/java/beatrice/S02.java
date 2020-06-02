package beatrice;
import static java.lang.Math.*;

public class S02 {
    // VELOCITA MEDIA
    /**
     * 
     * @param distance in meters
     * @param time in seconds
     * @return speed in meters per seconds
     */
    public static double speed(double distance, double time) {
        if (time < 0.0) {
            return 0.0;
        }
        else {
            return distance / time;
        }
    }
    
//  PROVA SPEED
//    public static void main (String[] args) {
//        double distance = 159.6;
//        double time = 9.1;
//        System.out.println("Mean velocity is : "+ speed(distance, time) + " m/s");
//    } 
    
   // DISTANZA TRA DUE PUNTI 
  /**
   * @param x0 first point x
   * @param y0 first point y
   * @param x1 second point x
   * @param y1 second point y
   * @return distance
   */

  public static double distance(int x0, int y0, int x1, int y1) {
      return sqrt((y1 - y0) * (y1 - y0) + (x1 - x0) * (x1 - x0));
  }

//  //PROVA DISTANCE 
//  public static void main (String[] args) {
//      int x0 = 4;
//      int y0 = 2;
//      int x1 = -4;
//      int y1 = 0;
//      System.out.println("Distance between two point is : "+ distance(x0, y0, x1, y1));
//  } 

  // CILINDRATA TOTALE
  /**
   * Engine capacity
   * 
   * @param bore   in mm
   * @param stroke in mm
   * @param nr     number of cylinders
   * @return the engine capacity in cm^3
   */
  public static double engineCapacity(double bore, double stroke, int nr) {
      double Bore = bore;
      double Stroke = stroke;
      int NR = nr;
      return (PI*(Bore/2)*(Bore/2)*Stroke*NR)/1000 ;
  }
  
// PROVA ENGINECAPACITY
//  public static void main (String[] args) {
//      int bore = 74;
//      int stroke = 75;
//      int nr = 4;
//      System.out.println("Total engine capacity is: "+ engineCapacity(bore, stroke, nr));
//  } 
  
  // SOMMA DELLE CIFRE
  /**
   * Add up all the digits in an integer
   * 
   * @param value
   * @return sum of digits
   */
  public static int digitSum(int value) {
      int value_pos= abs(value);
      int somma = 0;
      while(value_pos > 0){
          somma+=(value_pos%10);
          value_pos = value_pos/10;
          }
      return somma; 
  }
  
//  //PROVA SOMMA DELLE CIFRE
//  public static void main (String[] args) {
//    int value=56;
//    System.out.println("Sum of digit is: "+ digitSum(value));
//}
  
  
  // CENTRO
  /**
   * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
   *
   * @param x
   * @param y
   *
   * @return
   */
  public static int score(double x, double y) {
      double distanza = sqrt(x*x+y*y);
      if (distanza <=1)
          return 10;
      else if ((distanza>1) & (distanza<=5))
          return 5;
      else if ((distanza>5) & (distanza<=10))
          return 1;
      else
          return 0; 
  }
  
//  // PROVA SCORE
//  public static void main(String[] args) {
//      double x = 0;
//      double y = 0.1;
//      System.out.println("Your score is: " + score(x,y));
//  }
}