package com.example.xyzhotel.service.impl;

import com.example.xyzhotel.model.UserObj;
import com.example.xyzhotel.model.execption.ExistingEmailExecption;
import com.example.xyzhotel.model.execption.InvalidUserExecption;
import com.example.xyzhotel.repository.UserRepository;
import com.example.xyzhotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserObj save(UserObj userObj) throws InvalidUserExecption,ExistingEmailExecption {
        if (userObj.getfName()==null){
            throw new InvalidUserExecption("FIRST NAME CANNOT BE NULL");
        }
        if(userObj.getlName()==null){
            throw new InvalidUserExecption("LAST NAME CANNOT BE NULL");
        }
        if(userObj.getEmail()==null){
            throw new InvalidUserExecption("EMAIL CANNOT BE NULL");
        }
        if(userObj.getPassword()==null){
            throw new InvalidUserExecption("PASSWORD CANNOT BE NULL");
        }
        if(userObj.getPhonenum()==null){
            throw new InvalidUserExecption("PHONE CANNOT BE NULL");
        }
        if(userObj.getCountry()==null){
            throw new InvalidUserExecption("COUNTRY CANNOT BE NULL");
        }
        if(userObj.getCity()==null){
            throw new InvalidUserExecption("CITY CANNOT BE NULL");
        }
        if(findByEmail(userObj.getEmail())!=null){
            throw new ExistingEmailExecption("EMAIL ALREADY REGISTERED");
        }
        userObj=userRepository.save(userObj);
        return userObj;

    }

    @Override
    public UserObj findByEmail(String email) {
        UserObj userObj=userRepository.findByEmail(email);
        return userObj;
    }
}
