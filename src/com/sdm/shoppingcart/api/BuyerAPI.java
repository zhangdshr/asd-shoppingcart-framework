package com.sdm.shoppingcart.api;

import java.util.List;

import com.sdm.shoppingcart.model.CartItem;

interface BuyerAPI {

	void addProductToShoppingCart(CartItem cartItem);
	
	boolean cancelAddProductToShoppingCart();

	void removeProductFromShoppingCart(long id);

	void editProductCountById(CartItem cartItem);

	List<CartItem> getCartItemListInShoppingList(long userId);

	// ...

	/**
	 * 
	 * @param list
	 * @param userType VIP: 1, NORMAIL: 2
	 * @return the price of after calculation
	 */
	long getPriceOfSelectedCartItemsByUserType(List<CartItem> list, int userType, int shippingment, int typeDiscount);

	/**
	 * 
	 * @param list
	 * @param discountValue
	 * @return the price of after calculation
	 */
	long getPriceOfSelectedCartItemsByDiscount(List<CartItem> list, int discountValue, int shippingment);

	/**
	 * 
	 * @param list
	 * @param the minimum of the discount value
	 * @return the price of after calculation
	 */
	long getPriceOfSelectedCartItemsByTotalPrice(List<CartItem> list, int threshold, int shippingment);

}
