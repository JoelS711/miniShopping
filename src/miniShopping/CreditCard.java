package miniShopping;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
	
	private double limit;
	private double balance;
	private List<Purchase> ShoppingList;
	
	
	public CreditCard(double limit) {
		super();
		this.limit = limit;
		this.balance = limit;
		this.ShoppingList = new ArrayList<>();
	}


	public double getLimit() {
		return limit;
	}


	public double getBalance() {
		return balance;
	}


	public List<Purchase> getShoppingList() {
		return ShoppingList;
	}
	
	public boolean launch(Purchase purchase) {
		if(this.balance >= purchase.getPrice()) {
			this.balance -= purchase.getPrice();
			this.ShoppingList.add(purchase);
			return true;
		}
		return false;
	}

}
