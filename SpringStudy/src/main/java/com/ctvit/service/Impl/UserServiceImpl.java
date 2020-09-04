package com.ctvit.service.Impl;

import com.ctvit.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Override
	public void query() {
		System.out.println("hahaha");
	}
}
