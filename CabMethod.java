import java.util.Scanner;

public class CabMethod {
	static Scanner scanner=new Scanner(System.in);
	
static int distanceCal() {	
	int distance=-1;
	while(distance<0)
	{
	System.out.println("Select your destination");
	System.out.println("1. Manheim");
	System.out.println("2. Heidleberg");
	System.out.println("3. Berlin");
	System.out.println("4. Futwagen");
	byte destinationChoice = scanner.nextByte();
	switch(destinationChoice) {
	case 1: 
		distance=150;
		break;
	case 2: 
		distance=250;
		break;
	case 3:
		distance=50;
		break;
	case 4:
		distance=167;
		break;
		default: 
			System.out.println("Wrong choice");
			distance=-1;
			break;
	}
	}
	return distance;
}

	static int priceCal()
	{
		int pricePerKm=-1;
		while(pricePerKm<0)
		{
		System.out.println("Select your Cab");
		System.out.println("1. Micro\t\u20AC 5,00");
		System.out.println("2. Mini\t\u20AC 10,00");
		System.out.println("3. Sedan\t\u20AC 20,00");
		System.out.println("4. SUV\t\u20AC 35,00");
		byte CabChoice = scanner.nextByte();
		switch(CabChoice) {
		case 1: 
			pricePerKm=5;
			break;
		case 2: 
			pricePerKm=10;
			break;
		case 3:
			pricePerKm=20;
			break;
		case 4:
			pricePerKm=35;
			break;
			default: 
				System.out.println("Wrong choice");
				pricePerKm=-1;
				break;
		}
		}
		return pricePerKm;
	}
	
		static void paymentCal()
		{
			int distance =distanceCal();
			int pricePerKm = priceCal();
			byte paymentMethod=-1;
			int discount=0;
			while(paymentMethod<0)
			{
			System.out.println("How would you like to pay?\n1.Cash\n2.Online");
			paymentMethod=scanner.nextByte();
			
			if(paymentMethod==2) {
				discount=10*distance*pricePerKm/100;
			}
			if(paymentMethod!=1&&paymentMethod!=2) {
				System.out.println("Wrong Choice");
			}
		}
			System.out.println("---------------------------------------");
			System.out.println("Distance\t\t\t"+distance);
			System.out.println("Price per kilometer\t"+pricePerKm);
			System.out.println("Discount(-)\t\t\t("+discount+")");
			System.out.println("---------------------------------------");
			System.out.println("Amount\t\t\t"+((distance*pricePerKm)-discount));
			System.out.println("---------------------------------------");
		}	
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Welcome to Ola Cabs \nEnter your name");
			String name= new String();
			name=scanner.nextLine();		
			paymentCal();
	scanner.close();
		}

	}


