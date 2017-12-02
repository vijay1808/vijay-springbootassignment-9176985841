package org.springboot.sampleproject.create.DAO;

import org.springboot.sampleproject.create.Request.CreateReq;
import org.springboot.sampleproject.create.res.CreateRes;

public interface CreateResourceDAO {

	
	public CreateRes createResource(CreateReq req) throws Exception;
	public CreateRes updateUser(CreateReq req) throws Exception;
	
}
