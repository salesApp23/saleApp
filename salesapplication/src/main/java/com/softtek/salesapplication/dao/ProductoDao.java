package com.softtek.salesapplication.dao;

import java.util.ArrayList;

import com.softtek.salesapplication.dto.Catalogo;

public interface ProductoDao {
	/**
	 * Este metodo regresara la lista de marcas
	 * @return ArrayList<Catalogo>
	 */
	public ArrayList<Catalogo> getCatalogo();
	
	/**
	 * Este metodo regresara un registro de
	 * la lista de marcas
	 * @return ArrayList<Catalogo>
	 */
	public ArrayList<Catalogo> getProductoById();
	
	/**
	 * Este metodo hara la insercion en la base de datos
	 */
	public void insertProducto(String nombre, int id_marca, int existencia, float precio);
	
	/*
	 * Este metodo eliminara el producto segun su id
	 */
	public void deleteProducto(int id_marca);
	
	/*
	 * Este metodo actualizara los datos de un registro
	 */
	public void updateProducto(int id_marca);
	/*
	 * Este metodo regresara un elemento de la base de datos
	 * @return 
	 */

	
}
