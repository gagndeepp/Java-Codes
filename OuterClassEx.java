
public class OuterClassEx {

	int n1,n2;
	
	void put() {
		n1 = 10;
		n2 = 20;
		
	}
	
	class InnerClass{
		int n3 = 6;
		void show() {
			put();
		}
	}
	public static void main(String[] args) {
			InnerClass ob = new OuterClassEx().new InnerClass();
			ob.show();
	}

}
