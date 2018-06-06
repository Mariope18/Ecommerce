package com.ecommerce.controller.base;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.bson.types.ObjectId;
import org.springframework.security.access.annotation.Secured;
import org.springframework.beans.factory.annotation.Autowired;
import com.ecommerce.db.ecommerce_db.service.CategoryService;
import com.ecommerce.db.ecommerce_db.entity.Category;

//IMPORT RELATIONS

public class CategoryBaseController {
    
    @Autowired
	CategoryService categoryService;



//CRUD METHODS



/*
 * CUSTOM SERVICES
 * 
 *	These services will be overwritten and implemented in  Custom.js
 */


	
}
