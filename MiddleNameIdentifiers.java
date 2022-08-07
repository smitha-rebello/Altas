import java.util.Scanner;
import java.util.StringTokenizer;
public class MiddleNameIdentifiers {

	public static void main(String[] args) {
		System.out.println("Enter your full name:");
		Scanner scanner = new Scanner(System.in);
		String fullName=scanner.nextLine();
		byte i =0;
		scanner.close();
		//String [] names=new String();
		StringTokenizer tokenizer = new StringTokenizer(fullName, "  ");
		while(tokenizer.hasMoreTokens()) {
		//names[i] = tokenizer.nextToken(fullName);
		}
	}

}
