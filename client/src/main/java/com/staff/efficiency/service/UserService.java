package com.staff.efficiency.service;

import com.staff.efficiency.models.UserModel;
import com.staff.efficiency.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel getRandomUser(){
        return userRepository.getRandomUser();
    }

}
