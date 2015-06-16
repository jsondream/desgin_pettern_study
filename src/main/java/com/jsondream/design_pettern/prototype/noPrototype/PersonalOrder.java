package com.jsondream.design_pettern.prototype.noPrototype;

public class PersonalOrder implements OrderApi {

	private String customerName;
	
	private String productId;
	
	private int orderProductNum = 0;
	
	
	@Override
	public int getOrderProductNum() {
		// TODO Auto-generated method stub
		return this.orderProductNum;
	}

	@Override
	public void setOrderProductNum(int num) {
		// TODO Auto-generated method stub
		this.orderProductNum = num;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "PersonalOrder [customerName=" + customerName + ", productId="
				+ productId + ", orderProductNum=" + orderProductNum + "]";
	}
	
	
	

}
