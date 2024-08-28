import java.util.Scanner;

public class IT24103011Lab5Q3 {
    public static void main(String[] args) {
        
		final int minDAY = 1;
		final int roomRATE = 48000;
        final int maxDAY = 31;

        Scanner sc = new Scanner(System.in);

			System.out.print("Enter start date (1-31): ");
			int startDate = sc.nextInt();
			
			System.out.print("Enter end date (1-31): ");
			int endDate = sc.nextInt();

       
				if (startDate < minDAY || startDate > maxDAY || endDate < minDAY || endDate > maxDAY) {
					System.out.println("Error: Dates must be between 1 and 31.");
					return;
				}
				if (startDate >= endDate) {
					System.out.println("Error: Start date must be less than end date.");
					return;
				}

        
				int daysReserved = endDate - startDate;
				double discount = 0;

       
				if (daysReserved >= 3 && daysReserved <= 4) {
					discount = 0.10; // 10% discount for 3 to 4 days
				} else if (daysReserved >= 5) {
					discount = 0.20; // 20% discount for 5 or more days
				}

        
        double totalAmount = daysReserved*roomRATE* (1 - discount);

        // Output results
        System.out.println("Days Reserved: " + daysReserved);
        System.out.println("Total Amount: Rs " + totalAmount);

        
    }
}