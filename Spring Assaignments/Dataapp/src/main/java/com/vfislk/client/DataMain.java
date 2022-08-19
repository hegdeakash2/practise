package com.vfislk.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vfislk.dao.DataServiceImpl;
import com.vfislk.service.IDataService;

public class DataMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext("com.vfislk");
		
		IDataServiceDAO service= context.getBean(IDataServiceDAO.class,"dataServiceImpl");
		
		service.
		                

	}

}
