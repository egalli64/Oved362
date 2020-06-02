

public class P {
	
	public static void main(String[] args) {
		Esercizi es = new Esercizi(-7);
		
		Voti esempio = new Voti();
		es.segno();
		Fibonacci prova = new Fibonacci();
		Media prova1= new Media();
		
		int[] myNum = {10, 20, 30, 40}; 
		
		System.out.println(esempio.trasforma(95));
		System.out.println(prova.fibonacci(4));
		System.out.println(prova1.media(myNum));
	}

}
