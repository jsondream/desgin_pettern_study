package com.jsondream.design_pettern.factory.hasFactory;

public class ExportTextOperate extends ExportOperate {

	@Override
	public ExportApi factoryMethod() {
		// TODO Auto-generated method stub
		return new ExportText();
	}

}
