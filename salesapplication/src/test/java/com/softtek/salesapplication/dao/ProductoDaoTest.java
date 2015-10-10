package com.softtek.salesapplication.dao;

import java.util.ArrayList;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import com.softtek.salesapplication.dao.impl.ProductoDaoImpl;
import com.softtek.salesapplication.dto.Catalogo;

public class ProductoDaoTest extends SalesApplicationBaseDaoTest {
	
	@Autowired
	private ProductoDao productoDao;
	
	public void setCatalogoDao(ProductoDaoImpl catalogoDao){
		this.productoDao=productoDao;
	}
	
	@Test
	public void productoDaoTest(){
		
		ArrayList<Catalogo> catalogos = productoDao.getCatalogo();
		Assert.notNull(catalogos);
		Assert.isTrue(catalogos.size() > 0);
		
	}
}
