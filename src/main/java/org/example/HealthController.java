package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String checking(){
        return "I am Working";
    }

}
