package org.springframework.samples.app.service;

import org.springframework.samples.app.pojo.User;

public interface IUserService {
	public User getUserById(int userId);
}
