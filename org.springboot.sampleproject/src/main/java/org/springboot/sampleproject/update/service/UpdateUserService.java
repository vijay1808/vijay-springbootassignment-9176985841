package org.springboot.sampleproject.update.service;

import org.springboot.sampleproject.create.Request.CreateReq;
import org.springboot.sampleproject.create.res.CreateRes;

public interface UpdateUserService {

	public CreateRes updateUser(CreateReq req) throws Exception;
	
}
