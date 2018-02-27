package com.vin.controller;

import com.vin.model.Login;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {
    @PostMapping("/auth")
    public boolean authUser(@RequestBody Login login){
        System.out.println(login.getUserName()+login.getPassword());
        return true;
    }
}
