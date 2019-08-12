package com.sdm.shoppingcart.command;

public interface Command {
	public boolean execute();

	public boolean undo();
}
