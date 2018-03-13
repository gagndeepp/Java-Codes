import java.util.*;
public class ArrExample {
	
	public void passArray(int [][] arr) {
		System.out.println("Printing through Pass Function");
		for(int i[]:arr) {
				for(int j : i)
			System.out.print(j + " ");
			System.out.println();
		}
	}
	static Scanner sc;
	public static void main(String [] args) {
		
		
		int ar[][] = new int[3][4] ;
		sc = new Scanner(System.in);
		System.out.println("Enter elements");
		//n= sc.nextInt();
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[0].length;j++)
				ar[i][j] = sc.nextInt();
		}
		
		System.out.println("Rows + Columns == " + ar.length + "  " +  ar[0].length);
		//String[] ar = new String[5];
		/*for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}*/
		
		ArrExample ob = new ArrExample();
		ob.passArray(ar);
		
	}
}
