package controllers;

import service.impl.userService;
import models.userLoginRequest;
import models.userSignUpRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(/"user")
public class userController {

    @Autowired
    private userService userservice;

    @PostMapping("/signup")
    public ResponseEntity userSignup(@RequestBody userSignUpRequest userSignup) {
        userService.createUser(userSignUpRequest );

    }
    @PostMapping("/login")
    public ResponseEntity userLogin(@RequestBody userLoginRequest userLogin){
        boolean areCredentialsCorrect=userService.validateCredentials(userLogin)

    }

}
