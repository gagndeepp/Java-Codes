
interface Notification{
	void notificationBySms();
	void notificationByEmail();
	void notificationByCourier();
}

class icici implements Notification{

	

	@Override
	public void notificationByEmail() {
		// TODO Auto-generated method stub
		System.out.println("Notification by Email ICICI");
	}

	@Override
	public void notificationByCourier() {
		// TODO Auto-generated method stub
		System.out.println("Notification by Courier ICICI");
	}

	@Override
	public void notificationBySms() {
		// TODO Auto-generated method stub
		System.out.println("Notification by SMS ICICI");
	}
	
}

class hdfc implements Notification{

	@Override
	public void notificationBySms() {
		// TODO Auto-generated method stub
		System.out.println("Notification by SMS HDFC");
	}

	@Override
	public void notificationByEmail() {
		// TODO Auto-generated method stub
		System.out.println("Notification by Email HDFC");
	}

	@Override
	public void notificationByCourier() {
		// TODO Auto-generated method stub
		System.out.println("Notification by Courier HDFC");
	}
	
}
public class BankFactory{
	
//	public icici geticici() {
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


