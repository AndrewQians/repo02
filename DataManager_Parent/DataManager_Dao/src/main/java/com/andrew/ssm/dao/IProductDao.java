package com.andrew.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.andrew.ssm.domian.Product;

public interface IProductDao {
	
	@Select("select *from product")
	public List<Product> findAll();
}
