package com.jsondream.design_pettern.builder.noBuilder;

import java.util.Collection;

public class ExportToTxt {

	public void export(ExportHeader eh ,
			Collection<ExportData> mapData,ExportFooter ef){
		StringBuffer  buffer = new StringBuffer();
		
		buffer.append("部门id:").append(eh.getDepId());
		for(ExportData data:mapData){
			buffer.append("\n");
			buffer.append("产品id:").append(data.getProdeuctId());
		}

		buffer.append("\n");
		buffer.append("导出用户:").append(ef.getExportUser());
		
		System.out.println(buffer.toString());
	}
}
