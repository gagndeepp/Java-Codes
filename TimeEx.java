import java.util.Scanner;

public class TimeEx {

	int hr,min,sec;
	Scanner sc;
	TimeEx(){
		System.out.println("Enter hr || min || sec");
		sc = new Scanner(System.in);
		hr = sc.nextInt();
		min = sc.nextInt();
		sec = sc.nextInt();
	}
	TimeEx(int x){
		//empty constructor
	}
	
	static TimeEx add(TimeEx t1, TimeEx t2){
		TimeEx retTime = new TimeEx(5) ;
		retTime.hr = t1.hr + t2.hr;
		retTime.min = t1.min + t2.min;
		retTime.sec = t1.sec + t2.sec;
		while(retTime.sec >= 60) {
			retTime.min++;
			retTime.sec = retTime.sec-60;
		}
		while(retTime.min >= 60) {
			retTime.hr++;
			retTime.min = retTime.min-60;
		}
		
		return retTime;
	}
	
	static void displayTime(TimeEx t) {
		System.out.println("Time Added up ::");
		System.out.println(String.format("%02d", t.hr) + " : " + String.format("%02d", t.min)  + " : " + String.format("%02d", t.sec));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeEx t1 = new TimeEx();
		TimeEx t2 = new TimeEx();	
		TimeEx t3 = TimeEx.add(t1, t2);
		TimeEx.displayTime(t3);
	}

}
