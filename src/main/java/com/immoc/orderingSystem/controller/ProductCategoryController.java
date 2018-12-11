package com.immoc.orderingSystem.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import com.immoc.orderingSystem.dataobject.ProductCategory;

import java.util.List;
import java.util.Optional;

/**
 * Created by 廖师兄
 * 2017-05-07 14:35
 */
@Controller
public interface ProductCategoryController extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

	ProductCategory findOne(Integer categoryId);
}
