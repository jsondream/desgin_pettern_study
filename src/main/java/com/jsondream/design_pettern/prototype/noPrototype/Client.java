package com.jsondream.design_pettern.prototype.noPrototype;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalOrder p = new PersonalOrder();
		p.setCustomerName("張三");
		p.setProductId("p001");
		p.setOrderProductNum(2650);
		new OrderBusiness().saveOrder(p);
	}

}
