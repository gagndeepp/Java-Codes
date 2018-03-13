import java.util.*;
public class dateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Date dd = new Date();
				System.out.println(dd);
				Date d = new Date(2018,2,11);
				System.out.println(d.compareTo(dd) + " " +  d.equals(dd));
		}
}
