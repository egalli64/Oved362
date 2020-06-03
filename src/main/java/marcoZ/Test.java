package marcoZ;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	String checkSign(int n) {
		if (n > 0)
			return "positive";
		if (n < 0)
			return "negative";
		return "zero";
	}

	String isOdd(int n) {
		if (n % 2 != 0)
			return "odd";
		return "even";
	}

	String asWord(int n) {
		switch (n) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default:
			return "other";
		}
	}

	char vote(int n) {
		if (n > 90)
			return 'A';
		if (n > 80)
			return 'B';
		if (n > 70)
			return 'C';
		if (n > 60)
			return 'D';
		if (n > 50)
			return 'E';
		return 'F';
	}

	boolean isLeapYear(int n) {
		if (n % 4 == 0) {
			if (n % 100 == 0) { // anno secolare
				if (n % 400 == 0)
					return true;
				else
					return false;
			}
			return true;
		}
		return false;
	}

	int[] sort(int a, int b, int c) {
		int[] list = new int[3];
		
		if (a >= b) {
			if (a >= c) {
				list[0] = a;
				if (b >= c) {
					list[1] = b;
					list[2] = c;
				} else {	//b < c
					list[1] = c;
					list[2] = b;
				}
			} else {	//a < c
				list[0] = c;
				list[1] = a;
				list[2] = b;
			}
		} else {	//b > a
			if (b >= c) {
				list[0] = b;
				if (a >= c) {
					list[1] = a;
					list[2] = c;
				} else {	//a < c
					list[1] = c;
					list[2] = a;
				}
			} else {	//b < c
				list[0] = c;
				list[1] = b;
				list[2] = a;
			}
		}
		return list;
	}
	
	int loop(int first, int last) {
		int res = 0;
		for (int i = first; i < last; i++)
			res += i;
		
		return res;
	}
	
	int sumEven(int first, int last) {
		int res = 0;
		int i = first % 2 == 0 ? first : first+1;
		for (; i < last; i+=2)
			res += i;
		
		return res;
	}
	
	double sqrt(int n) {
		//TODO
		return 0.0;
	}
	
	String reverse(String s) {
		int l = s.length();
		char[] reversed = new char[l];
		for (int i = 0; i < s.length(); i++) {
			reversed[l] = s.charAt(i);
			l--;
		}
		return new String(reversed);
	}
	
	boolean isPalindrome(String s) {
		int l = s.length();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(l))
				return false;
			l--;
			if (l < i)
				break;
		}
		
		return true;
	}
	
	String removeVowels(String s) {
		char[] newS = new char[s.length()];
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isVowel(c)) {
				newS[index] = c;
				index++;
			}
		}
		return new String(newS);
	}
	boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
				c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}
	
	int bin2dec(String bin) {
		int exp = 0;
		int sum = 0;
		for (int i = bin.length(); i > 0; i--) {
			if (bin.charAt(i) == '1')
				sum += 2^exp;
			exp++;
		}
		return sum;
	}
	
	int[] reverseNew(int[] array) {
		int len = array.length;
		int[] newArray = new int[len];
		
		for (int i : array) {
			newArray[len] = i;
			len--;
		}
		
		return newArray;
	}
	
	int[] reverseInPlace(int[] array) {
		int len = array.length;
		int half = Math.floorDiv(len, 2);
		
		for (int i = 0; i < half; i++) {
			int temp = array[i];
			array[i] = array[len];
			array[len] = temp;
			len--;
		}
		
		return array;
	}
	
	double average(int[] array) {
		double avg = 0.0;
		
		for (int i : array)
			avg += i;
		
		return avg/array.length;
	}
	
	int max(int[] array) {
		int max = array[0];
		
		for (int i = 1; i < array.length; i++)
			if (i > max)
				max = i;
		
		return max;
	}
	
	boolean isPrime(int n) {
		for (int i = 2; i < Math.floorDiv(n, i); i++)
			if (n % i == 0)
				return false;
		
		return true;
	}
	
	int sommaDivisori(int n) {
		int sum = 0;
		for (int i = n-1; i > 1; i--)
			if (n % i == 0)
				sum+=i;
		return sum;
	}
	boolean isPerfect(int n) {
		return sommaDivisori(n) == n;
	}
	boolean isAbundant(int n) {
		return sommaDivisori(n) > n;
	}
	boolean isDeficient(int n) {
		return sommaDivisori(n) < n;
	}
	
	
}
