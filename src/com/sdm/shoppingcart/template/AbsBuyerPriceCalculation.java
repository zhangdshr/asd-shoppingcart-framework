package com.sdm.shoppingcart.template;

public abstract class AbsBuyerPriceCalculation {

	protected abstract int doCalculatePrice();

	protected abstract int doCalculatePriceOfShippingment();

	public final int getFinalPrice() {
		return doCalculatePrice() + doCalculatePriceOfShippingment();
	}

}
