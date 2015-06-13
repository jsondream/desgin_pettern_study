package com.jsondream.design_pettern.factory.hasFactory;

public class ExportDbOperate extends ExportOperate {

	@Override
	public ExportApi factoryMethod() {
		// TODO Auto-generated method stub
		return new ExportDb();
	}

}
