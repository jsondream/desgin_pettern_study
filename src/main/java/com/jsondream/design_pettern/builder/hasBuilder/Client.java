package com.jsondream.design_pettern.builder.hasBuilder;

import java.util.ArrayList;
import java.util.Collection;

import com.jsondream.design_pettern.builder.noBuilder.ExportData;
import com.jsondream.design_pettern.builder.noBuilder.ExportFooter;
import com.jsondream.design_pettern.builder.noBuilder.ExportHeader;

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
		
		
		// TODO Auto-generated method stub
		TxtBuilder txtBuilder = new TxtBuilder();
		Director director = new Director(txtBuilder);
		director.construct(eh, mapData, ef);
		System.out.println(txtBuilder.getResult());
		
		System.out.println("-------------------------------------");
		
		XmlBuilder xmlBuilder= new XmlBuilder();
		Director director1 = new Director(xmlBuilder);
		director1.construct(eh, mapData, ef);
		System.out.println(xmlBuilder.getResult());
	}

}
