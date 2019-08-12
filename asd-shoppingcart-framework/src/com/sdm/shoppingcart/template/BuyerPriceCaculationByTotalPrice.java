package com.sdm.shoppingcart.template;

import java.util.List;

import com.sdm.shoppingcart.model.CartItem;

public class BuyerPriceCaculationByTotalPrice extends AbsBuyerPriceCalculation {

	List<CartItem> list;
	int threshold;
	int shippingment;
	private float price = 0;

	boolean shipFlag = false;

	public BuyerPriceCaculationByTotalPrice(List<CartItem> list, int threshold, int shippingment) {
		this.list = list;
		this.threshold = threshold;
		this.shippingment = shippingment;
	}

	@Override
	protected int doCalculatePrice() {
		// TODO Auto-generated method stub
		for (CartItem item : list) {
			price += item.product.price * item.count;
		}
		if (price >= threshold) {
			shipFlag = true;
		} else {
			shipFlag = false;
		}
		return 0;
	}

	@Override
	protected int doCalculatePriceOfShippingment() {
		// TODO Auto-generated method stub
		if (shipFlag) {
			return 0;
		} else {
			return shippingment;
		}

	}

}
