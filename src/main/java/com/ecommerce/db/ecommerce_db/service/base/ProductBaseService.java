package com.ecommerce.db.ecommerce_db.service.base;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.db.ecommerce_db.entity.Product;

//IMPORT RELATIONS

@Service
public class ProductBaseService {

	
	@Autowired
	private Datastore datastore;


    //CRUD METHODS
    

    

    
    /*
     * CUSTOM SERVICES
     * 
     *	These services will be overwritten and implemented in ProductService.java
     */
    


}
