package org.springboot.sampleproject.update.service;

import org.springboot.sampleproject.create.DAO.CreateResourceDAOImpl;
import org.springboot.sampleproject.create.Request.CreateReq;
import org.springboot.sampleproject.create.res.CreateRes;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateUserServiceImpl implements UpdateUserService  {

	@Autowired
	CreateResourceDAOImpl dao;
	
	public CreateRes updateUser(CreateReq req) throws Exception {
	
		CreateRes res=new CreateRes();	
		try{
		res=dao.updateUser(req);
		return res;
		}catch(Exception e)
		{
			throw new Exception();
		}
		
	}

}
