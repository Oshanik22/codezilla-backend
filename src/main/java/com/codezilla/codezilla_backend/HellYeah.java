package com.codezilla.codezilla_backend;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellYeah {

    @GetMapping("/core/hellyeah")
    public String sayHellYeah() {
        return "hell yeah";
    }

    @GetMapping("/core/helloworld")
    public String sayHelloWorld() {
        return "hello world";
    }
}

