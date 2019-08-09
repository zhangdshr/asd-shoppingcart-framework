package com.sdm.shoppingcart.template;

import java.util.List;

import com.sdm.shoppingcart.model.CartItem;

public class BuyerPriceCaculationByDiscount extends AbsBuyerPriceCalculation {

	List<CartItem> list;
	int discountValue;
	int shippingment;
	private float price = 0;

	public BuyerPriceCaculationByDiscount(List<CartItem> list, int discountValue, int shippingment) {
		this.list = list;
		this.discountValue = discountValue;
		this.shippingment = shippingment;
	}

	@Override
	protected int doCalculatePrice() {
		// TODO Auto-generated method stub
		for (CartItem item : list) {
			price += item.product.price * item.count;
		}
		return (int) (price * discountValue / 100);
	}

	@Override
	protected int doCalculatePriceOfShippingment() {
		// TODO Auto-generated method stub
		return shippingment;
	}

}
