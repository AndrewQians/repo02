package com.andrew.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.andrew.ssm.dao.IProductDao;
import com.andrew.ssm.domian.Product;
import com.andrew.ssm.service.IProductService;

public class ProductServiceImpl implements IProductService {
	@Autowired
	IProductDao productDao;
	
	public List<Product> findAll() {
		List<Product> products = productDao.findAll();
		return products;
	}
	

}
