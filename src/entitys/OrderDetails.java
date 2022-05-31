package entitys;

public class OrderDetails {
	private Products products;
	private double quantity;
	private int quantityPromotion;
	private double totalMoneyAfterPromotion;

	public OrderDetails() {
		super();
	}

	public OrderDetails(Products products, double quantity, int quantityPromotion, double totalMoneyAfterPromotion) {
		this.products = products;
		this.quantity = quantity;
		this.quantityPromotion = quantityPromotion;
		this.totalMoneyAfterPromotion = totalMoneyAfterPromotion;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public int getQuantityPromotion() {
		return quantityPromotion;
	}

	public void setQuantityPromotion(int quantityPromotion) {
		this.quantityPromotion = quantityPromotion;
	}

	public double getTotalMoneyAfterPromotion() {

		return this.quantity * products.getPriceAfterPromotion();
	}

	public void setTotalMoneyAfterPromotion(double totalMoneyAfterPromotion) {
		this.totalMoneyAfterPromotion = totalMoneyAfterPromotion;
	}
}
