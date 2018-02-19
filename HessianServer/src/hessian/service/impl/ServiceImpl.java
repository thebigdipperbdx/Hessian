package hessian.service.impl;

import hessian.model.User;
import hessian.service.IService;

public class ServiceImpl implements IService {

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return new User("the Big Dipper");
	}

}
