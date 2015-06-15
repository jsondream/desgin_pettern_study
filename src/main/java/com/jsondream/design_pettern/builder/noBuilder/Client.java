package com.jsondream.design_pettern.builder.noBuilder;

import java.util.ArrayList;
import java.util.Collection;

public class Client {

	public static void main(String[] args) {
		ExportHeader eh = new ExportHeader();
		eh.setDepId("商业部");
		Collection<ExportData> mapData = new ArrayList<ExportData>();
		ExportData ed1 = new ExportData();
		ed1.setProdeuctId("产品001");
		ExportData ed2 = new ExportData();
		ed2.setProdeuctId("产品002");
		mapData.add(ed1);
		mapData.add(ed2);
		ExportFooter ef = new ExportFooter();
		ef.setExportUser("admin");
		
		new ExportToTxt().export(eh, mapData, ef);
		System.out.println("----------------------------------------------------");
		new ExportToXml().export(eh, mapData, ef);
	}

}
