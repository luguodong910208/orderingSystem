package com.immoc.orderingSystem.service;

import java.util.List;

import com.immoc.orderingSystem.dataobject.ProductCategory;

public interface ProductCategoryService {
	ProductCategory findOne(Integer categoryId);
	List<ProductCategory> findAll();
	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
	ProductCategory save(ProductCategory productCategory);
}
