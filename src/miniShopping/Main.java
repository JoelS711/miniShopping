package miniShopping;

import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the credit card limit: ");
		double limit = keyboard.nextDouble();
		CreditCard card = new CreditCard(limit);
		
		int exit = 1;
		while(exit != 0) {
			System.out.println("Enter the description of the purchase: ");
			String description = keyboard.next();
			
			System.out.println("Enter the purchase value: ");
			double value = Double.valueOf(keyboard.next());
			
			Purchase purchase = new Purchase(value, description);
			boolean purchaseCompleted = card.launch(purchase);
			
			if(purchaseCompleted) {
				System.out.println("Pruchase Completed!");
				System.out.println("Enter 0 to exit or 1 to continue");
				exit = keyboard.nextInt();
			}else {
				System.out.println("Insufficient Funds");
				exit = 0;
			}
		}
		System.out.println("********************");
		System.out.println("Pruchases Completed:\n");
		Collections.sort(card.getShoppingList());
		for(Purchase purchase : card.getShoppingList()) {
			System.out.println(purchase.getDescription() + " - " + purchase.getPrice());
			
		}
		
		System.out.println("********************");
		System.out.println("Balance: " + card.getBalance());
		keyboard.close();
	}

}
