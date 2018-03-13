import java.util.Scanner;

public class Prog2 {
	int ar,a,b;
	private static Scanner sc;
	
	void calc(int a,int b)
	{
		this.ar = a*b;
	}
	void show() {
		System.out.print("Area is \n");
		System.out.print(ar);
	}
	public static void main(String [] args) {
		Prog2 Ob = new Prog2();
		sc = new Scanner(System.in);
		int p,q;
		p = sc.nextInt();
		q = sc.nextInt();
		Ob.calc(p, q);
		Ob.show();
	}
}
