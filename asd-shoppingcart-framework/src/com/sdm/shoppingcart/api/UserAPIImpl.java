package com.sdm.shoppingcart.api;

import com.sdm.shoppingcart.cor.Concrete1LoginHandler;
import com.sdm.shoppingcart.cor.Concrete2LoginHandler;
import com.sdm.shoppingcart.cor.LoginHandler;
import com.sdm.shoppingcart.dao.UserDao;
import com.sdm.shoppingcart.model.AccountUser;

public class UserAPIImpl implements UserAPI {

	@Override
	public int login(String username, String password) {
		// TODO Auto-generated method stub
		AccountUser user = new AccountUser();
		user.username = username;
		user.password = password;

		LoginHandler handler1 = new Concrete1LoginHandler();
		LoginHandler handler2 = new Concrete2LoginHandler();
		handler1.setSuccessor(handler2);

		return handler1.handleRequest(user);
	}

	@Override
	public void addUser(AccountUser user) {
		// TODO Auto-generated method stub
		UserDao.getInstance().save(user);
	}

}
