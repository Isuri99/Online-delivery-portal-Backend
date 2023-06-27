package com.onlineDeliveryPortal.UserDashboard.service;

import com.onlineDeliveryPortal.UserDashboard.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
