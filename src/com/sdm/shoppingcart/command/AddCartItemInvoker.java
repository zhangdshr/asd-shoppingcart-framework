package com.sdm.shoppingcart.command;

public class AddCartItemInvoker {

	private Command cmd = null;

	public void setCmd(Command cmd) {
		this.cmd = cmd;
	}

	public void add() {
		this.cmd.execute();
	}

	public void cancelAdd() {
		this.cmd.undo();
	}

}
