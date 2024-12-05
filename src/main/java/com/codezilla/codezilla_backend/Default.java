package com.codezilla.codezilla_backend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Default {

    @GetMapping("/")
    public String defaultPath(){
        return "CodeZilla to the world : I'm Alive Bitches";
    }
}
