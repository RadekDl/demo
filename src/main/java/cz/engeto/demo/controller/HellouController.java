package cz.engeto.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/hello")
public class HellouController {
    @GetMapping()
    public String sayHello(){
        return "Hello from spring boot controller";
    }
    @GetMapping("/DE")
    public String sayHelloDE(){
        return "Hallo von Spring Boot in der Kontroller";
    }
    @PostMapping()
    public String createTheWorldHello(){
        return "New world was created";
    }
    @RequestMapping(method = RequestMethod.PUT, name = "/de")
    public String updateWord(){
        return "The word was updated";
    }



}
