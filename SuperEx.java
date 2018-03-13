
class A{
	A(int x){
		System.out.println("Constructor A || " + x);
	}
}


class SuperEx extends A{
	
	
	
	SuperEx(){
		super(10);
		System.out.println("Constructor SuperEx");
	}
	
	public static void main(String [] args) {
		
		SuperEx ob = new SuperEx();
		 
		
	}

}

