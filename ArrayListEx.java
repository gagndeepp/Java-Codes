import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> ar = new ArrayList<Customer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name,Type,Email,Location");
		for(int i=0;i<3;i++) {
			Customer c = new Customer(sc.next(),null,null,sc.next());
			ar.add(c);
		}
		for(Customer c :ar) {
			System.out.print(c + "  ..  ");
		}
		
		
	}

}
