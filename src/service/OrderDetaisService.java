package service;

import java.util.List;
import java.util.Scanner;

import entitys.Order;
import entitys.OrderDetails;
import entitys.Products;

public class OrderDetaisService {
	public OrderDetails addProductByOrderDetails(Products product, double quantity) {
		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setProducts(product);
		orderDetails.setQuantity(quantity);
		// if promotionQuantity != null and order amount > promotion amount . recalculate the number of products
		int amountAfterPromotion = 0;
		if(product.getPromotionType().getPromotionAmount()!= null) {
			String [] parts = product.getPromotionType().getPromotionAmount().split(" ");
			int promotionQuantity = Integer.parseInt(parts[0]);
			int freeQuantityByPromotion = Integer.parseInt(parts[2]);
			//int remainder = amount % promotionAmount;
			if(quantity >= (double) promotionQuantity) {

				int freeQuantity = (int)quantity / promotionQuantity * freeQuantityByPromotion;
				orderDetails.setQuantityPromotion(freeQuantity);
			}

		}

//		if(product.getPromotionType().getPromotionAmount()== null) {
//			orderDetails.setTotalMoneyAfterPromotion(quantity * product.getPrice());
//		}
		return orderDetails;
	}
}
