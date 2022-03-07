package com.techm.product.bo;

import com.techm.product.dao.ProductDAO;
import com.techm.product.dao.ProductDAOImpl;
import com.techm.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
