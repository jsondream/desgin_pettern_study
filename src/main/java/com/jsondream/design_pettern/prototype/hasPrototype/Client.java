package com.jsondream.design_pettern.prototype.hasPrototype;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalOrder p = new PersonalOrder();
		p.setCustomerName("張三");
		p.setProductId("p001");
		p.setOrderProductNum(2950);
		new OrderBusiness().saveOrder(p);
	}

}
