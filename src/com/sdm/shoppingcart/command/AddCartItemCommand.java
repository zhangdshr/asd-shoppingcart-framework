package com.sdm.shoppingcart.command;

import com.sdm.shoppingcart.dao.CartItemDao;
import com.sdm.shoppingcart.model.CartItem;

public class AddCartItemCommand implements Command {
	
	CartItemDao cartItemDao = CartItemDao.getInstance();
	
	CartItem cartItem;
	
	public AddCartItemCommand(CartItem cartItem) {
		this.cartItem = cartItem;
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		cartItemDao.save(cartItem);
		return true;
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		cartItemDao.remove(cartItem.id);
		return false;
	}

}
