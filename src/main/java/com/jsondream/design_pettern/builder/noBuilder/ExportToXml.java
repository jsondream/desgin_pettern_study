package com.jsondream.design_pettern.builder.noBuilder;

import java.util.Collection;
public class ExportToXml {

	public void export(ExportHeader eh ,
			Collection<ExportData> mapData,ExportFooter ef){
		StringBuffer  buffer = new StringBuffer();
		
		buffer.append("<deptId>").append(eh.getDepId()).append("</deptId>");
		for(ExportData data:mapData){
			buffer.append("\n");
			buffer.append("<产品id>").append(data.getProdeuctId()).append("</产品id>");
		}
		buffer.append("\n");
		buffer.append("<导出用户>").append(ef.getExportUser()).append("</导出用户>");
		
		System.out.println(buffer.toString());
	}
}
