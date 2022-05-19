package com.andrew.ssm.service;

import java.util.List;

import com.andrew.ssm.domian.Product;

public interface IProductService {

	//这里是查询所有的商品
	public List<Product> findAll();
}
