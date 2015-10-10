package com.softtek.salesapplication.dao;



import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;


@ContextConfiguration(locations={"/applicationContext.xml", "/springweb-dao.xml" })
public class SalesApplicationBaseDaoTest extends AbstractJUnit4SpringContextTests {

	JdbcTemplate jdbcTemplate = new JdbcTemplate() ;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	 protected int getMaxVal(String column, String table) {
	        String query = "SELECT MAX(" + column + ") FROM " + table;
			
			
			return this.jdbcTemplate.queryForInt(query);
	 }
}
