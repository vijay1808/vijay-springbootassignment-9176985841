package org.springboot.sampleproject.Controller;

import org.springboot.sampleproject.create.Request.CreateReq;
import org.springboot.sampleproject.create.res.CreateRes;
import org.springboot.sampleproject.create.service.CreateResourceServiceImpl;
import org.springboot.sampleproject.delete.service.DeleteResourceServiceImpl;
import org.springboot.sampleproject.update.service.UpdateUserServiceImpl;
import org.springboot.sampleproject.utils.ApplicationConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

	@Autowired
	CreateResourceServiceImpl service;
	UpdateUserServiceImpl updateService;
	DeleteResourceServiceImpl deleteService;

	@RequestMapping(method = RequestMethod.POST, value = ApplicationConstants.createRes)
	public ResponseEntity<CreateRes> createResource(@RequestBody CreateReq req) throws Exception {
		CreateRes res = new CreateRes();
		boolean isUserExists = false;

		try{
			System.out.println("in controller");
			System.out.println("req "+req.toString() );
		isUserExists = service.checkForUserExistence(req.getId());
		if (isUserExists) {
			res.setResMessage("Duplicate User Found");
		} else {
			res = service.createResource(req);
		}
		return new ResponseEntity<CreateRes>(res, HttpStatus.OK);
		}catch(Exception e)
		{
			throw new Exception();
		}
		
		
	}

	@RequestMapping(method = RequestMethod.PUT, value = ApplicationConstants.updateRes)
	public ResponseEntity<CreateRes> updateUser(@RequestBody CreateReq req) throws Exception {
		CreateRes res = new CreateRes();
		try{
		res = updateService.updateUser(req);
		return new ResponseEntity<CreateRes>(res, HttpStatus.OK);
		}catch(Exception e)
		{
			throw new Exception();
		}
		
	}

	@RequestMapping(method = RequestMethod.DELETE, value = ApplicationConstants.deleteRes)
	public ResponseEntity<CreateRes> deleteUser(@PathVariable("id") String id) throws Exception {
		CreateRes res = new CreateRes();
		try{
		res = deleteService.deactivateUser(id);
		return new ResponseEntity<CreateRes>(res, HttpStatus.OK);
		}catch(Exception e)
		{
			throw new Exception();
		}
		
		}
}
