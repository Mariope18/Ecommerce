package com.ecommerce.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.ecommerce.controller.base.CategoryBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/Ecommerce.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class CategoryController extends CategoryBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
