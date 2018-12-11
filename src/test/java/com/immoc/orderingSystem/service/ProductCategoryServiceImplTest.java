package com.immoc.orderingSystem.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.immoc.orderingSystem.dataobject.ProductCategory;
import com.immoc.orderingSystem.service.impl.ProductCategoryServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {
	@Autowired
	private ProductCategoryServiceImpl productCategoryServiceImpl;
	
	@Test
	public void findOne() throws Exception{
		ProductCategory productCategory = productCategoryServiceImpl.findOne(1);
		Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
	}
	@Test
	public void findAll() throws Exception{
		
	}
	@Test
	public void findByCategoryTypeIn() throws Exception{
		
	}
	@Test
	public void save() throws Exception{
		
	}
}
