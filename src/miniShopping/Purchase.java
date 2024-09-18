package miniShopping;

public class Purchase implements Comparable<Purchase>{

	private double price;
	private String description;
	
	public Purchase(double price, String description) {
		this.price = price;
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Purchase: price= " + price + ", description= " + description;
	}

	@Override
	public int compareTo(Purchase otherPurchase) {
		return Double.valueOf(this.price).compareTo(Double.valueOf(otherPurchase.getPrice()));
	}
	
	
}
