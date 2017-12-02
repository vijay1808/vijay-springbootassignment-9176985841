package org.springboot.sampleproject.delete.service;

import org.springboot.sampleproject.create.DAO.CreateResourceDAOImpl;
import org.springboot.sampleproject.create.res.CreateRes;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteResourceServiceImpl implements DeleteResourceService {

	@Autowired
	CreateResourceDAOImpl dao;
	
	@Override
	public CreateRes deactivateUser(String id) throws Exception {
		
		CreateRes res=new  CreateRes();
		try{
		res=dao.deleteUser(id);
		return res;
		}catch(Exception e)
		{
			throw new Exception();
		}
		
		}

	
	
}
