import java.io.*;
public class FileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//			File f  = new File("C:\\Users\\Gagan\\eclipse-workspace\\java-notes\\src\\newMade.java");
//			File f2  = new File("C:\\Users\\Gagan\\eclipse-workspace\\java-notes\\src\\aa.java");
//		//	f.createNewFile();
//			if(f.exists()) {
//				System.out.println("File Exists");
//				f.renameTo(f2);
//			}
//			else{
//				System.out.println("File Doesn't Exists");
//			}
//		
//		//	f.delete();
//			
//			if(f.isDirectory()) {
//			File f1[] = f.listFiles();
//			//try {
//				f.mkdir();
//				for(File f3:f1) {
//				System.out.println(f3); 
//				}
//			}
		
		FileInputStream fs = new FileInputStream("C:\\Users\\Gagan\\eclipse-workspace\\java-notes\\src\\ObPass.java");
		while(fs.read()!=-1)
		System.out.print((Object)fs.read());
		
			
	}
}

