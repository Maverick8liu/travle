package com.hg.hgc.test.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hg.hgc.core.feature.test.TestSupport;



public class CustomerServiceTest extends TestSupport{
	
	//@Resource
	//CustomerService customerService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/*//@Test
	public void findByNameTest(){
		String name = "127";
		Customer customer = customerService.selectByName(name);
		System.out.println(customer.toString());
	}
	//@Test
	public void updateModel(){
		Customer customer = new Customer();
		customer.setId(1l);
		customerService.update(customer);
	}*/
	
	@Test
	public void testDate(){
		try {
			String str = "20/04/2016 14:26:23";
			String pattern = "dd/MM/yyyy HH:mm:ss";
			//str = "2016/04/26 14:26:23";
			//pattern ="yyyy/MM/dd HH:mm:ss";
			/*SimpleDateFormat sdf = new SimpleDateFormat();
			Date date = (Date) sdf.parseObject(str);*/
			System.out.println(stringConvertDate(str, pattern));
			System.out.println(dateConvertString(new Date(), pattern));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Date stringConvertDate(String str,String pattern) throws ParseException{
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		return sdf.parse(str);
	}
	
	private String dateConvertString(Date date,String pattern) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		return sdf.format(date);
	}
	
	public static void main(String[] args){
		/*Date date = new Date();
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(date);
		
		cal.add(Calendar.MONTH, 1);
		
		Date date1 = cal.getTime();
		System.out.println("date is "+date.toString()+"\n date1 is "+ date1.toString());*/
		
		
		
	}
	
}
