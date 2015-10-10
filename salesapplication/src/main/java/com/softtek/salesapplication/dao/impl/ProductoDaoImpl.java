package com.softtek.salesapplication.dao.impl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;

import com.softtek.salesapplication.dao.ProductoDao;
import com.softtek.salesapplication.dto.Catalogo;
import com.softtek.salesapplication.dto.Producto;

import org.springframework.jdbc.core.RowMapper;

public class ProductoDaoImpl implements ProductoDao{
	//SELECT * FROM for_spring.CATALOGO
	private static String PRODUCTO_QUERY= "INSERT INTO salesapp.PRODUCTO (nombre, id_marca, existencia, precio)"
			+ " VALUES (?, ?, ?, ?)";
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public void insertProducto(Producto prod){
		this.jdbcTemplate.update(PRODUCTO_QUERY, prod.getNombre(), prod.getId(), prod.getExistencia(), prod.getPrecio());
	}
	
	public void deleteProducto(int id_marca) {
		 this.jdbcTemplate.update("DELETE FROM salesapp.PRODUCTO WHERE id = ?", id_marca);
	 }
	
	public void updateProducto(int id_marca) {
		this.jdbcTemplate.update("UPDATE salesapp.PRODUCTO set WHERE id = ?", id_marca);
		
	}

	public ArrayList<Catalogo> getProductoById() {
		// TODO Auto-generated method stub
		return null;
	}		
	
	public ArrayList<Catalogo> getCatalogo() {
		// TODO Auto-generated method stub
		return (ArrayList<Catalogo>) jdbcTemplate.query("SELECT * FROM salesapp.CATALOGO", new ProductoMapper());
	}
	
	
	private static final class ProductoMapper implements RowMapper{
		public Producto mapRow(ResultSet res, int rowNum) throws SQLException{
			//Catalogo
			Catalogo catalogo = new Catalogo();
			catalogo.setId(res.getInt("Id"));
			//Producto
			catalogo.setMarca(res.getString("marca"));
			Producto producto= new Producto();
			producto.setId(res.getInt("Id"));
			producto.setNombre(res.getString("nombre"));
			producto.setCatalogo(catalogo);
			producto.setExistencia(res.getInt("existencia"));
			producto.setPrecio(res.getFloat("precio"));
			return producto;
		}
	}


	public void insertProducto(String nombre, int id_marca, int existencia, float precio) {
		// TODO Auto-generated method stub
		
	}
	
}

	
