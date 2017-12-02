package org.springboot.sampleproject.create.service;

import org.springboot.sampleproject.create.DAO.CreateResourceDAOImpl;
import org.springboot.sampleproject.create.Request.CreateReq;
import org.springboot.sampleproject.create.res.CreateRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateResourceServiceImpl implements CreateResourceService {

	@Autowired
	CreateResourceDAOImpl dao;
	
	@Override
	public CreateRes createResource(CreateReq req) throws Exception {
	
		CreateRes res=new CreateRes();
	try{
		res=dao.createResource(req);
		return res;
	}catch(Exception e)
	{
		throw new Exception();
	}
	
	}
	
	public  boolean checkForUserExistence(String userId) throws Exception
	{
		boolean isUserExist=false;;
		CreateRes res=new CreateRes();
		isUserExist=dao.checkForUser(userId);
		return isUserExist;
		
	}
	
	

}
