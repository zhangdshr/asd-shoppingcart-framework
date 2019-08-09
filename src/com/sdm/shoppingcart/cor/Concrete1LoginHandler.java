package com.sdm.shoppingcart.cor;

import com.sdm.shoppingcart.model.AccountUser;

public class Concrete1LoginHandler extends LoginHandler {

	@Override
	public int handleRequest(AccountUser user) {
		// TODO Auto-generated method stub

		if (user.username.equalsIgnoreCase("admin") && user.password.equalsIgnoreCase("123")) {
			return 1;
		} else if (getSuccessor() != null) {
			return getSuccessor().handleRequest(user);
		}
		return -1;

	}
	
	

}
