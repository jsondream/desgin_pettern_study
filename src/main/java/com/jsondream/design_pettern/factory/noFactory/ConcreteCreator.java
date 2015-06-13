package com.jsondream.design_pettern.factory.noFactory;

public class ConcreteCreator extends Creator {

	@Override
	protected Product factoryMethod() {
		// TODO Auto-generated method stub
		return new ConcreateProduct();
	}

}
