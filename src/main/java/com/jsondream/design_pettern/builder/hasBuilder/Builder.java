package com.jsondream.design_pettern.builder.hasBuilder;

import java.util.Collection;

import com.jsondream.design_pettern.builder.noBuilder.ExportData;
import com.jsondream.design_pettern.builder.noBuilder.ExportFooter;
import com.jsondream.design_pettern.builder.noBuilder.ExportHeader;

public interface Builder {

	public void builderHeader(ExportHeader eh);
	
	public void builderData(Collection<ExportData> ed);
	
	public void builderFooter(ExportFooter ef);
	
}
