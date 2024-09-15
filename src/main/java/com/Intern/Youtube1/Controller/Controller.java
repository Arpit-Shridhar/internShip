package com.Intern.Youtube1.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @PostMapping("/add")
    public int add(@RequestBody AddRequest request) {
        System.out.println("Incoming values are | request: " + request);
        
        int sum = request.getNum1() + request.getNum2();
        
        System.out.println("Sum: " + sum);
        return sum;
    }
}
