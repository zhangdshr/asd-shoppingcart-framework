package com.sdm.shoppingcart.api;

import java.util.List;

import com.sdm.shoppingcart.command.AddCartItemCommand;
import com.sdm.shoppingcart.command.AddCartItemInvoker;
import com.sdm.shoppingcart.command.Command;
import com.sdm.shoppingcart.dao.CartItemDao;
import com.sdm.shoppingcart.model.CartItem;
import com.sdm.shoppingcart.template.AbsBuyerPriceCalculation;
import com.sdm.shoppingcart.template.BuyerPriceCaculationByDiscount;
import com.sdm.shoppingcart.template.BuyerPriceCaculationByTotalPrice;
import com.sdm.shoppingcart.template.BuyerPriceCaculationByUserType;

public class BuyerAPIImpl implements BuyerAPI {

	AddCartItemInvoker invoker;

	@Override
	public void addProductToShoppingCart(CartItem cartItem) {
		// TODO Auto-generated method stub
		Command cmd = new AddCartItemCommand(cartItem);
		invoker = new AddCartItemInvoker();
		invoker.setCmd(cmd);
		invoker.add();
	}

	@Override
	public boolean cancelAddProductToShoppingCart() {
		// TODO Auto-generated method stub
		if (invoker != null) {
			invoker.cancelAdd();
			return true;
		}
		return false;
	}

	@Override
	public void removeProductFromShoppingCart(long id) {
		// TODO Auto-generated method stub
		CartItemDao.getInstance().remove(id);
	}

	@Override
	public void editProductCountById(CartItem cartItem) {
		// TODO Auto-generated method stub
		CartItemDao.getInstance().update(cartItem);
	}

	@Override
	public List<CartItem> getCartItemListInShoppingList(long userId) {
		// TODO Auto-generated method stub
		return CartItemDao.getInstance().getAllByUserId(userId);
	}

	@Override
	public long getPriceOfSelectedCartItemsByUserType(List<CartItem> list, int userType, int shippingment,
			int typeDiscount) {
		// TODO Auto-generated method stub
		AbsBuyerPriceCalculation bpc = new BuyerPriceCaculationByUserType(list, userType, shippingment, typeDiscount);
		return bpc.getFinalPrice();
	}

	@Override
	public long getPriceOfSelectedCartItemsByDiscount(List<CartItem> list, int discountValue, int shippingment) {
		// TODO Auto-generated method stub
		AbsBuyerPriceCalculation bpc = new BuyerPriceCaculationByDiscount(list, discountValue, shippingment);
		return bpc.getFinalPrice();
	}

	@Override
	public long getPriceOfSelectedCartItemsByTotalPrice(List<CartItem> list, int threshold, int shippingment) {
		// TODO Auto-generated method stub
		AbsBuyerPriceCalculation bpc = new BuyerPriceCaculationByTotalPrice(list, threshold, shippingment);
		return bpc.getFinalPrice();
	}

}
