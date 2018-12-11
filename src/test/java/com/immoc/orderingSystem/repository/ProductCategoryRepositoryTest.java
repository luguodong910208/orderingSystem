package com.immoc.orderingSystem.repository;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.immoc.orderingSystem.controller.ProductCategoryController;
import com.immoc.orderingSystem.dataobject.ProductCategory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
	
	@Autowired
	private ProductCategoryController repository;
	@Test
	public void findOneTest(){
		ProductCategory productCategory = repository.findOne(1);
		System.out.println(productCategory.toString());
	}
	@Test
	public void saveTest(){
		ProductCategory productCategory = new ProductCategory();
		productCategory.setCategoryName("女生最爱");
		productCategory.setCategoryType(3);
		repository.save(productCategory);
	}
}
