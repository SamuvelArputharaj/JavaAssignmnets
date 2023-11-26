package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
	
		int n=13;
		boolean prime = true;
		
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {	
			prime=false;
			break;
			}			
		}
		if(prime==true) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Non-Prime");
		}
	}

}
