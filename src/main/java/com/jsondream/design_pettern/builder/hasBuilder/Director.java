package com.jsondream.design_pettern.builder.hasBuilder;

import java.util.Collection;

import com.jsondream.design_pettern.builder.noBuilder.ExportData;
import com.jsondream.design_pettern.builder.noBuilder.ExportFooter;
import com.jsondream.design_pettern.builder.noBuilder.ExportHeader;

public class Director {
	private Builder builder;
	
	public Director(Builder builder){
		this.builder = builder;
	}

	public void construct(ExportHeader eh ,
			Collection<ExportData> mapData,ExportFooter ef){
		builder.builderHeader(eh);
		builder.builderData(mapData);
		builder.builderFooter(ef);
	}
}
