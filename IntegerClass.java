import java.util.*;

public class IntegerClass {

	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		String a;
		System.out.println("Enter Binary");
		a = sc.next();
		System.out.println("Integer = == " + Integer.parseInt(a,2));
		System.out.println("Enter Hex");
		a = sc.next();
		System.out.println("Integer = == " + Integer.parseInt(a,16));
		System.out.println("Enter Octal");
		a = sc.next();
		System.out.println("Integer = == " + Integer.parseInt(a,8));
		/*System.out.println("The Binary of" +x+"  is " + Integer.toBinaryString(x));
		System.out.println("The Hex of" +x+"  is " + Integer.toHexString(x));
		System.out.println("The Octal of" +x+"  is " + Integer.toOctalString(x));
		System.out.println("The Byte of" +x+"  is " + x.byteValue());
		System.out.println("The Float of" +x+"  is " + x.floatValue());*/
		
	}
	

}
