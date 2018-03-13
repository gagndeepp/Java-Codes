import java.util.*;
public class MainClass {



	static Scanner sc;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		sc = new Scanner(System.in);
		System.out.println("Enter Details  >> Name | Email | Type | Location");
		customer.setName(sc.next());
		customer.setEmail(sc.next());
		customer.setType(sc.next());
		customer.setLocation(sc.next());
		
		System.out.println("Customer Details :: " + customer.getName() + ".." + customer.getEmail() + ".." + customer.getType() + ".." + customer.getLocation());
	} 

}
