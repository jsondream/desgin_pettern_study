package com.jsondream.design_pettern.factory.hasFactory;

public abstract class ExportOperate {

	public boolean export(String data){
		ExportApi api = factoryMethod();
		return api.export(data);
	}
	
	public abstract ExportApi factoryMethod();
}
