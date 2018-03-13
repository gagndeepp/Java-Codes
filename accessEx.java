

class m{
//	private void disp() {
//		System.out.println("HEllo");
//	}
}

public class accessEx extends m{
		protected void disp() {
			System.out.println("Welcome");
		}
		
		public static void main(String [] args) {
			accessEx ob = new accessEx();
			ob.disp();
//			m obj = new m();
			//obj.disp();
		}
}
