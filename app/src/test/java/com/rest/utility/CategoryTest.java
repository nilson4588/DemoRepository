package com.rest.utility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import com.rest.dao.CategoryDao;
import com.rest.model.Category;
import com.rest.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = "spring-config.xml")
public class CategoryTest {

	/*
	 * @Mock private CategoryDao dao;
	 */
	
	@Autowired
    private CategoryDao categoryService;
		 
	/*
	 * @Before public void setup() { MockitoAnnotations.initMocks(this); }
	 */
	
	//@Test
    public void addCategory() throws Exception {
    	
		Category c = new Category();
		c.setCategoryName("category - 1");
		c.setCategoryIndustryId(0);
		c.setIsActive(1);
				
    	assertEquals(1, categoryService.saveOrUpdateCategory(c));		
    }
 
    @Test
    public void listCategory() throws Exception {
    	  //System.out.println(categoryService.getCategoryList());
    	assertEquals(9, categoryService.getCategoryList().size());		
    }
}
