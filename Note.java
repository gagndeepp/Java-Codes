
public class Note {
	int n1,n2;
	void S(int n1,int n2) {
		this.n1 = n1*n1;
		this.n2 = n2+n2;
		
	}
	void show() {
		System.out.print(n1);
		System.out.println();
		System.out.print(n2);
	}
	public static void main(String [] args) {
		Note Obj = new Note();
		Obj.S(6, 3);
		Obj.show();
	}
}
