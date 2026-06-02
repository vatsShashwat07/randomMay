package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClothController {

    @GetMapping("/cloths")
    public List<String> getCloths(){
        return List.of("Shirt, Pant, Towel, PillowCover");
    }
}
