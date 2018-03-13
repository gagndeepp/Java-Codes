import java.io.*;

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String in = "";
		while(String.strcmp(in,"stop")) {
			in = br.readLine();
			System.out.println(" >>>> " + in);
			}
		
	}
}
