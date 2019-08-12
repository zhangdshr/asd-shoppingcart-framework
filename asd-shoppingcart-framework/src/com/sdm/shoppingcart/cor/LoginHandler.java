package com.sdm.shoppingcart.cor;

import com.sdm.shoppingcart.model.AccountUser;

public abstract class LoginHandler {
	/**
	 * 持有后继的责任对象
	 */
	protected LoginHandler successor;

	/**
	 * 示意处理请求的方法，虽然这个示意方法是么有传入参数的，但实际 是可以传入参数的，根据具体需要来选择是否需要传递参数
	 */
	public abstract int handleRequest(AccountUser user);

	/**
	 * 取值方法
	 * 
	 * @return
	 */
	public LoginHandler getSuccessor() {
		return successor;
	}

	/**
	 * 赋值方法，指定后继的责任对象
	 * 
	 * @param successor
	 */
	public void setSuccessor(LoginHandler successor) {
		this.successor = successor;
	}
}
