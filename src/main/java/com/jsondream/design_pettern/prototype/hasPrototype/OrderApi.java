package com.jsondream.design_pettern.prototype.hasPrototype;

public interface OrderApi {

	public int getOrderProductNum();
	
	public void setOrderProductNum(int num);
	
	public OrderApi clone();
}
