package com.hg.hgc.test.dao;

import static org.junit.Assert.fail;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hg.hgc.core.feature.test.TestSupport;


public class CustomerMapTest extends TestSupport{
	/*@Resource
    private CustomerMapper customerMapper;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	//@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//@Test
	public void insertModelTest(){
		Customer customer = new Customer();
		CustomerGroupInfo info = new CustomerGroupInfo();
		info.setId(1l);
		//customer.setGroupInfo(info);
		customer.setGroupid(1l);
		customer.setCreateTime(new Date());
		customer.setCustomName("Test01");
		customer.setLoginName("Test01");
		customer.setPassword("123");
		customer.setPhone("123");
		customer.setState("1");
		
		customerMapper.insertSelective(customer);
	}
	
	@Test
	public void selectByGroupId(){
		List<Customer> list = customerMapper.selectByGroupId(1l);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			Customer customer = (Customer) iterator.next();
			System.out.printf("您好,我是来自%s的%s,请大家多多关照！\n",customer.getGroupInfo().getGroupname(),customer.getCustomName() );
		}
		
	}
	
	@Test
	public void selectByExample(){
		CustomerExample example = new CustomerExample();
		CustomerExample.Criteria crt = example.createCriteria();
		crt.andCustomNameEqualTo("Jerry");
		List<Customer> list = customerMapper.selectByExample(example);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			Customer customer = (Customer) iterator.next();
			System.out.printf("您好我是来自%s的 %s！",customer.getGroupid(),customer.getCustomName() );
		}
	}
	*/
}
