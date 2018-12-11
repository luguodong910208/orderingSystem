package com.immoc.orderingSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immoc.orderingSystem.controller.ProductCategoryController;
import com.immoc.orderingSystem.dataobject.ProductCategory;
import com.immoc.orderingSystem.service.ProductCategoryService;
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
	@Autowired
	private ProductCategoryController productCategoryRepository;
	@Override
	public ProductCategory findOne(Integer categoryId) {
		return productCategoryRepository.findOne(categoryId);
	}

	@Override
	public List<ProductCategory> findAll() {
		return productCategoryRepository.findAll();
	}

	@Override
	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
		return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
	}

	@Override
	public ProductCategory save(ProductCategory productCategory) {
		return productCategoryRepository.save(productCategory);
	}

}
