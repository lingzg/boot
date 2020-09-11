package com.lingzg.boot;

import org.junit.Test;

import com.lingzg.boot.util.Word2HtmlUtil;
import com.spire.pdf.FileFormat;
//import com.spire.xls.Workbook;

public class TestCase {

	@Test
	public void testWord2Html() throws Exception{
		//Word2HtmlUtil.word2Html("D:/cecsysProject/项目原型/电力物联网原型更新记录20200619.docx", "D:/","doctest.html");
		Word2HtmlUtil.word2Html("C:/Users/zdka001/Documents/快递费，出租车费，宴请费，月油费，礼品费明细单/油费报销明细说明.doc", "D:/","doctest2.html");
	}
	
	/*@Test
	public void excel2pdf() throws Exception{
		//加载Excel文档
        Workbook wb = new Workbook();
        wb.loadFromFile("test.xlsx");

        //调用方法保存为PDF格式
        wb.saveToFile("ToPDF.pdf",FileFormat.PDF);
	}*/
}
