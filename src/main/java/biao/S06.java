package biao;

public class S06 {
	public static boolean isPrime(int num) {
		int count = 0;
		for (int i= 1; i<=num; i++) {
			if((num % i)==0) {
				count ++;
			}
			
		}
		if(count==2) {
			return true;
		}else {
			return false;
		}

	}	
	public static boolean isArmostrong(int num) {
		double sum = 0;
		int count =0;
		int tmpNum=num;
		while(tmpNum>0) {
			tmpNum= tmpNum/10;
			count++;
		}
		tmpNum=num;
		while(tmpNum>0) {
			int tmp= tmpNum % 10;
			sum = sum + Math.pow(tmp, count);
			tmpNum= tmpNum / 10;
		}
		if(sum == num) {
			return true;
		}else {
			return false;
		}
		
	}		
}
