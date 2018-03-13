import java.util.*;
public class Tree_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				TreeSet<Integer> tset = new TreeSet();
				tset.add(43);
				tset.add(43);
				tset.add(123);
				System.out.println(tset);
				HashSet<String> hset = 
			               new HashSet<String>();

			      // Adding elements to the HashSet
			      hset.add("Apple");
			      hset.add("Mango");
			      hset.add("Grapes");
			      hset.add("Orange");
			      hset.add("Fig");
			      //Addition of duplicate elements
			      hset.add("Apple");
			      hset.add("Mango");
			      //Addition of null values
			      hset.add(null);
			      hset.add(null);

			  //    Iterator it = new HashMap<Integer,String>().entrySet().iterator();
			//      Map.Entry<Integer, String> mentry =(Map.Entry<Integer, String>)  it.next();
			      //Displaying HashSet elements
			      System.out.println(hset);
	}

}
