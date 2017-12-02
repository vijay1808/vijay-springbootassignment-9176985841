package org.springboot.sampleproject.create.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.springboot.sampleproject.create.Request.CreateReq;
import org.springboot.sampleproject.create.res.CreateRes;
import org.springframework.stereotype.Repository;

@Repository
public class CreateResourceDAOImpl implements CreateResourceDAO {

	HashMap<String, ArrayList<CreateReq>> map = new HashMap<String, ArrayList<CreateReq>>();

	@Override
	public CreateRes createResource(CreateReq req) throws Exception {

		CreateRes res = new CreateRes();

		try {
			String id = req.getId();
			ArrayList<CreateReq> list = new ArrayList<CreateReq>();
			list.add(req);
			map.put(id, list);
			
			System.out.println("Record inserted successfully");
			
			return res;
		} catch (Exception e) {
			throw new Exception();
		}

	}

	@Override
	public CreateRes updateUser(CreateReq req) throws Exception {
		CreateRes res = new CreateRes();
		ArrayList<CreateReq> list = new ArrayList<CreateReq>();
		try {
			String id = req.getId();

			list = map.get(req.getId());
			if (list.isEmpty()) {
				res.setResMessage("No Data found to be updated");
			}

			for (CreateReq reqObj : list) {
				reqObj.setBirthDate(req.getBirthDate());
				reqObj.setPinCode(req.getPinCode());
				list.add(reqObj);
				map.put(id, list);
			}
			if (list.size() >= 1) {
				res.setResMessage("Record Updated Successfully");
			}

			return res;

		} catch (Exception e) {
			throw new Exception();
		}
	}

	public CreateRes deleteUser(String id) throws Exception {
		CreateRes res = new CreateRes();
		ArrayList<CreateReq> list = new ArrayList<CreateReq>();
		try {
			list = map.get(id);
			for (CreateReq req : list) {
				req.setActive(false);
				list.add(req);
				map.put(id, list);
				if (!req.isActive()) {
					res.setResMessage("User Deactivated");
				}

			}
			return res;
		} catch (Exception e) {
			throw new Exception();
		}

	}

	public boolean checkForUser(String id) {
		boolean status = false;
		ArrayList<CreateReq> list = new ArrayList<CreateReq>();
		list = map.get(id);
		if (list==null) {
			status = false;
		} else {
			status = true;
		}
		return status;
	}

}
