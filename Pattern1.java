import java.util.*;
public class Pattern1 {
	static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			sc = new Scanner(System.in);
			int x = sc.nextInt();
			int i = 1;
			while(x>0) {
				
				if(i%2==0) {
					for(int j=x;j>=1;j--) {
						System.out.print( j +" ");
					}
				}
				else {
					
					for(int j=1;j<=x;j++) {
						System.out.print( j +" ");
					}
				}
				System.out.println();
				x--;
				i++;
				
			}

	}

}
