import java.util.*;
public class PrimeNo {
	

	
		
	public static boolean isPrime(int n) {
		
	//	boolean isPrime = true;
	    for (int i = 2; i < n/2; i++) {
	      
	    	if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			
			for(int i=1;i<=x;i++) {
				if(isPrime(i)) {
					System.out.println("Prime ::: " + i);
				}
			}
		
	}

}
