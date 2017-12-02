package org.springboot.sampleproject.delete.service;

import org.springboot.sampleproject.create.res.CreateRes;

public interface DeleteResourceService {

	public CreateRes deactivateUser(String id) throws Exception;
	
}
