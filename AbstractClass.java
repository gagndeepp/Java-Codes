
abstract class BaseC{
	abstract void run();
}

class AbstractClass extends BaseC{

	void run() {
		System.out.println("Abstract Function Implemneted || RUN");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseC ob = new AbstractClass();
		ob.run();
		
	}

}
