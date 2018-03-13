
public class ObPass {

	int n1,n2,area;
	
	void pass(ObPass obj2) {
		obj2.area = obj2.n1 * obj2.n2;
	}
	
	void show() {
		System.out.println(area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ObPass ob = new ObPass();
			ob.n1 = 5; ob.n2 = 6;
			ObPass object = new ObPass();
			object.pass(ob);
			object.show();
			ob.show();
	}

}
