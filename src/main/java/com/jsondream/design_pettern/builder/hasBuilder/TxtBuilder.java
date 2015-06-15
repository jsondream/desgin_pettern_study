package com.jsondream.design_pettern.builder.hasBuilder;

import java.util.Collection;

import com.jsondream.design_pettern.builder.noBuilder.ExportData;
import com.jsondream.design_pettern.builder.noBuilder.ExportFooter;
import com.jsondream.design_pettern.builder.noBuilder.ExportHeader;

public class TxtBuilder implements Builder {
	
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void builderHeader(ExportHeader eh) {
		buffer.append("部门id:").append(eh.getDepId());
		

	}

	@Override
	public void builderData(Collection<ExportData> ed) {
		// TODO Auto-generated method stub
		for(ExportData data:ed){
			buffer.append("\n");
			buffer.append("产品id:").append(data.getProdeuctId());
		}
		buffer.append("\n");
	}

	@Override
	public void builderFooter(ExportFooter ef) {

		buffer.append("导出用户:").append(ef.getExportUser());

	}
	
	public String getResult(){
		return this.buffer.toString();
	}

}
