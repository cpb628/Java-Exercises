import java.io.PrintWriter;

public class exer002_printer_writer {
	public static void main(String args[]) {
		PrintWriter pw = new PrintWriter(System.out, true);
		String st = "Java 101 Programming!";
		
		pw.println("This is a " + st);
		
	}	
}
