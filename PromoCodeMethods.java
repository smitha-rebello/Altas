import java.util.Scanner;

public class PromoCodeMethods {

	static void computeDiscount(String promoCode, int amount) {
		int discount =0;
		switch(promoCode.toUpperCase()) 
		{
			case "TRYNEW": if(amount>=249) {
									discount= (amount*10/100)>50?50:(amount*10/100);
									}
			else {System.out.println("Add items worth \u20B9"+(249-amount)+" inorder to use this Promo code");}
									break;
			case "MISSYOU": if(amount>=159) {
				discount= (amount*10/100)>100?100:(amount*10/100);
										}
			else {System.out.println("Add items worth \u20B9"+(149-amount)+" inorder to use this Promo code");}
										break;
			case "BIG": if(amount>=500) {
				discount= (amount*10/100);
										}
			else {System.out.println("Add items worth \u20B9"+(500-amount)+" inorder to use this Promo code");}
										break;
			default: System.out.println("Incorrect Promo code");
		}
		System.out.println("--------------------------------------------------------:");
		System.out.println("Total \t\t\t\t\t\t"+amount);
		System.out.println("Discount \t\t\t\t\t"+discount);
		System.out.println("--------------------------------------------------------:");
		System.out.println("Grand Total \t\t\t\t\t"+(amount-discount));
		System.out.println("--------------------------------------------------------:");
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Zomato\nEnter the required information to check for offers");
		System.out.println("Amount:");
		int amount = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Promo Code:");
		String promoCode = scanner.nextLine();
		
		computeDiscount(promoCode,amount);
		scanner.close();
		
		}
}
