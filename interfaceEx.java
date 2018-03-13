

interface printable{
	void print();
	default void print2() {
		System.out.println("Default Print 2 Called");
	};
}


class printingC implements printable{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is OverRidden Methods from Interface printable Class PrintingC");
	}
	//abstract void print2();
}


public class interfaceEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			printable ob = new printingC();
			ob.print2();
	}



}
