package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean temp : list){
			Object[]  obj = new Object[8]; 
			obj[0] = temp.getFirstName(); 
			obj[1] = temp.getLastName();
			obj[2] = temp.getEmail(); 
			obj[3] = temp.getUserName();
			obj[4] = temp.getPassword(); 
			obj[5] = temp.getPassword2();
			obj[6] = temp.getPhone(); 
			obj[7] = temp.getlanguage();
			
			result[count ++] = obj; 
		}
				
		return result;
	}
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData()
	{
	String fileName ="C:/Roopa/Data.xlsx"; 
	return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name = "excel-inputs1")
	public Object[][] getExcelData1()
	{
	String fileName ="C:/Roopa/Data1.xlsx"; 
	return new ApachePOIExcelRead().getExcelContent(fileName); 
	}
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData()
	{
			return new ReadExcel().getExcelData("C:/Roopa/test.xlsx", "Sheet1"); 
	}
	
	
}
