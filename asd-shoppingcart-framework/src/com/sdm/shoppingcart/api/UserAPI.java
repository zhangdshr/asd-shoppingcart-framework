package com.sdm.shoppingcart.api;

import com.sdm.shoppingcart.model.AccountUser;

public interface UserAPI {
	
	int login(String username, String password);
	
	void addUser(AccountUser user);

}
