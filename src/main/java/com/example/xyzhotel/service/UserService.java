package com.example.xyzhotel.service;

import com.example.xyzhotel.model.UserObj;
import com.example.xyzhotel.model.execption.ExistingEmailExecption;
import org.springframework.stereotype.Repository;
import com.example.xyzhotel.model.execption.InvalidUserExecption;

public interface UserService {
    public UserObj save(UserObj userObj) throws InvalidUserExecption, ExistingEmailExecption;

    public UserObj findByEmail(String email);

    public UserObj findByEmailAndPassword(String email,String password);
}
