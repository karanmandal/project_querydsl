package com.krm.controller;

import com.krm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/get-all")
    public ResponseEntity getAll() {
        return ResponseEntity.ok(userService.getAll());
    }
}
