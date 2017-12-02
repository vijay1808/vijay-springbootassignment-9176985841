package org.springboot.sampleproject.create.service;

import org.springboot.sampleproject.create.Request.CreateReq;
import org.springboot.sampleproject.create.res.CreateRes;

public interface CreateResourceService {

	public CreateRes createResource(CreateReq req) throws Exception;
	public boolean checkForUserExistence(String userId) throws Exception;
	
}
