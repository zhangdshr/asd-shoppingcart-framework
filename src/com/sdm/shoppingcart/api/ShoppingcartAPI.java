package com.sdm.shoppingcart.api;

public class ShoppingcartAPI {
	
	// Singleton 
	private static volatile BuyerAPI instanceBuyerAPI;

	public static BuyerAPI getInstanceBuyerAPI() {
		if (instanceBuyerAPI == null) {
			synchronized (BuyerAPI.class) {
				if (instanceBuyerAPI == null) {
					instanceBuyerAPI = new BuyerAPIImpl();
				}
			}
		}
		return instanceBuyerAPI;
	}

	private static volatile SellerAPI instanceSellerAPI;

	public static SellerAPI getInstanceSellerAPI() {
		if (instanceSellerAPI == null) {
			synchronized (BuyerAPI.class) {
				if (instanceSellerAPI == null) {
					instanceSellerAPI = new SellerAPIImpl();
				}
			}
		}
		return instanceSellerAPI;
	}

	private static volatile OrderAPI instanceOrderAPI;

	public static OrderAPI getInstanceOrderAPI() {
		if (instanceOrderAPI == null) {
			synchronized (OrderAPI.class) {
				if (instanceOrderAPI == null) {
					instanceOrderAPI = new OrderAPIImpl();
				}
			}
		}
		return instanceOrderAPI;
	}
}
