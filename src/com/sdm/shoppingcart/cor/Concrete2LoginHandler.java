package com.sdm.shoppingcart.cor;

import com.sdm.shoppingcart.model.AccountUser;

public class Concrete2LoginHandler extends LoginHandler {

	@Override
	public int handleRequest(AccountUser user) {
		// TODO Auto-generated method stub
		if (user.username.equalsIgnoreCase("tom") && user.password.equalsIgnoreCase("123")) {
			return 2;
		} else if (getSuccessor() != null) {
			return getSuccessor().handleRequest(user);
		}
		return -1;
	}

}
