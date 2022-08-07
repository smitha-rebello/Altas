import java.util.Scanner;
public class Seven {

	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number:");
	int number = scanner.nextInt();
	int temp=number, count=0, n;
	while(temp>0) {
		n=temp%10;
		temp=temp/10;
		if(n==7) {
			count++;
		}
	}
	System.out.println("The number 7 is present "+count+" times in the number "+number);
	scanner.close();
	}
}
