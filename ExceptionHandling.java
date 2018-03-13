import java.util.Scanner;
class ExceptionHandling{
	
	static void fun1() {
		System.out.println("Class Temp");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Class Temp");
//			temp2 ob = new temp();
//			ob.fun1();
			//temp2 ob1 = new temp2();
//			int a = Integer.parseInt("ABC");
//			System.out.println(a);
			Scanner sc = new Scanner(System.in);
			
			int c = 0;
			try {
				int x = sc.nextInt();
				int y = sc.nextInt();
				System.out.println(x + " .... " + y);
				throw new ArithmeticException("Dead End");
			//	c =  x/y;
			//	System.out.println(c + " .... ");
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			//	System.out.println(e.printStackTrace(););
			}
			
			finally {
				
				//System.out.println(c + "<<");
				System.out.println( ">>Hi This is Executed in Finally Block.. ");
					
			}
			

	}

}
