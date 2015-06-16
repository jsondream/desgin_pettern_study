package com.jsondream.design_pettern.prototype.noPrototype;

public class OrderBusiness {

	public void saveOrder( OrderApi order){
		while(order.getOrderProductNum() >1000){
			OrderApi newOrder = null;
			if(order instanceof PersonalOrder){
				PersonalOrder p1  = new PersonalOrder();
				PersonalOrder p2 = (PersonalOrder) order;
				p1.setCustomerName(p2.getCustomerName());
				p1.setProductId(p2.getProductId());
				p1.setOrderProductNum(1000);
				newOrder = p1;
			} else if(order instanceof CompanyOrder){
				CompanyOrder c1= new CompanyOrder();
				CompanyOrder c2 = (CompanyOrder) order;
				c1.setCustomerName(c2.getCustomerName());
				c1.setProductId(c2.getProductId());
				c1.setOrderProductNum(1000);
				newOrder = c1;
			}
			//TODO:正常这里是db的保存
			order.setOrderProductNum(order.getOrderProductNum()-1000);
			System.out.println("拆分生成訂單=="+newOrder);
		}
		System.out.println("訂單"+order);
	}
}
