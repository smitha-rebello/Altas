import java.util.Scanner;
public class GstComputation {

	public static void main(String[] args) {
		double amount, gst, gstAmount;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount");
		amount=scanner.nextDouble();
		System.out.println("Enter the GST %");
		gst=scanner.nextDouble();
		gstAmount=amount*gst/100;
		System.out.println("----------------------------------------------");
		System.out.println("Amount\t\t\u20b9"+amount);
		System.out.println("GST  "+gst+"%\t\t\u20b9"+(gstAmount));
		System.out.println("----------------------------------------------");
		System.out.println("Amount Payable\t\t\u20b9"+(gstAmount+amount));
		System.out.println("----------------------------------------------");
	}

}
