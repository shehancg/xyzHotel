package com.example.xyzhotel.controller.restContoller;

import com.example.xyzhotel.model.UserObj;
import com.example.xyzhotel.model.execption.ExistingEmailExecption;
import com.example.xyzhotel.model.execption.InvalidUserExecption;
import com.example.xyzhotel.model.responsehandle.Response;
import com.example.xyzhotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/reg")
    public String save(UserObj userObj){
        try
        {
            userObj=userService.save(userObj);
            Response response= Response.success(userObj);
            return "register_succes";
        }
        catch(InvalidUserExecption invalidUserExecption){
            Response response= Response.fail(invalidUserExecption.getMessage());
            return null;
        }
        catch(ExistingEmailExecption existingEmailExecption){
            Response response= Response.fail(existingEmailExecption.getMessage());
            return "index";
        }
    }

    /*@RequestMapping("/login")
    public String loginHomepage(@RequestParam("email")String email,@RequestParam("password")String password,Model model){
        try {
            userObj=userService.findByEmail(userObj);
            Response response= Response.success(userObj);
            return "customer";
        }catch (InvalidUserExecption invalidUserExecption){
            Response response= Response.fail(invalidUserExecption.getMessage());
        }
        if(userObj.getEmail())
        userObj.getEmail("email", email);
        return "customer";
    } */

    @PostMapping("/login")
    public String findByEmailAndPassword(UserObj userObj, Model model){
        try
        {
            userObj=userService.findByEmailAndPassword(userObj.getEmail(),userObj.getPassword());
            if(userObj != null) {
                Response response = Response.success(userObj);
                model.addAttribute("fName", userObj.getfName());
                model.addAttribute("lName", userObj.getlName());
                return "customer";
            }
            return null;
        }
        catch(InvalidUserExecption invalidUserExecption){
            Response response= Response.fail(invalidUserExecption.getMessage());
            return null;
        }
    }


}
