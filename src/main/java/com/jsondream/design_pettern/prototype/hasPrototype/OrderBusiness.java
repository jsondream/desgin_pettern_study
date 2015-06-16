package com.jsondream.design_pettern.prototype.hasPrototype;

public class OrderBusiness {

	public void saveOrder( OrderApi order){
		while(order.getOrderProductNum() >1000){
			OrderApi newOrder = order.clone();
			newOrder.setOrderProductNum(1000);
			//TODO:正常这里是db的保存
			order.setOrderProductNum(order.getOrderProductNum()-1000);
			System.out.println("拆分生成訂單=="+newOrder);
		}
		System.out.println("訂單"+order);
	}
}
