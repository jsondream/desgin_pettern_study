package com.jsondream.design_pettern.factory.noFactory;

public abstract class Creator {
	protected abstract Product factoryMethod();
	
	public void someOperate(){
		Product product = factoryMethod();
	}
}
