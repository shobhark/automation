package com.datadriven.Test;

import com.excel.utility.Xls_Reader;

public class Excel_operations {

	public static void main(String[] args) {
		
		
		Xls_Reader reader = new Xls_Reader("D:\\workspace\\dataProvider\\src\\main\\java\\com\\testdata\\RegTestdata_halfeBay.xlsx");
		
		if(!reader.addSheet("Homapage"))
		{
			reader.addSheet("Homapage");
		}
		
		int colcnt = reader.getColumnCount("RegTestData");
		System.out.println("total columns present in sheet : " +colcnt);
	}

}
