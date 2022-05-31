package service;

import java.util.ArrayList;
import java.util.List;


import entitys.OrderDetails;
import entitys.Products;

public class OrderService {
	List<OrderDetails> listOrderDetails = new ArrayList<OrderDetails>();
	public List<OrderDetails> addProductByOrderdetails(OrderDetails orderDetails) {
		listOrderDetails.add(orderDetails);
		return listOrderDetails;
	}
	public void showOrder(List<OrderDetails> list) {
		System.out.println("Name         Quantity         PromotionalQuantity         Price         PriceAfterPromotion"
				+"         Total");
		for(OrderDetails orderDetails : list) {

			System.out.print(orderDetails.getProducts().getName()+ "         ");
			System.out.print(orderDetails.getQuantity()+ "                 ");
			System.out.print(orderDetails.getQuantityPromotion()+ "                  ");
			System.out.print(orderDetails.getProducts().getPrice()+ "                  ");
			System.out.print(orderDetails.getProducts().getPriceAfterPromotion()+ "                ");
			System.out.println(orderDetails.getTotalMoneyAfterPromotion());
		}
		
	}
	public double totalBills(List<OrderDetails> list) {
		double total = 0;
		for(OrderDetails orderDetails : list) {
			total += orderDetails.getTotalMoneyAfterPromotion();
		}
		return total;
	}
	
	
}
