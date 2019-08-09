package com.sdm.shoppingcart.template;

import java.util.List;

import com.sdm.shoppingcart.model.CartItem;

public class BuyerPriceCaculationByUserType extends AbsBuyerPriceCalculation {

	List<CartItem> list;
	int userType;
	int shippingment;
	int typeDiscount;
	private float price  = 0;

	public BuyerPriceCaculationByUserType(List<CartItem> list, int userType, int shippingment, int typeDiscount) {
		this.list = list;
		this.userType = userType;
		this.shippingment = shippingment;
		this.typeDiscount = typeDiscount;
	}

	@Override
	protected int doCalculatePrice() {
		// TODO Auto-generated method stub
		for (CartItem item : list) {
			price += item.product.price * item.count;
		}

		return (int) (price * typeDiscount / 100);
	}

	@Override
	protected int doCalculatePriceOfShippingment() {
		// TODO Auto-generated method stub
		return shippingment;
	}

}
