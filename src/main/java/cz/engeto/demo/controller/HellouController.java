package cz.engeto.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/hello") // toto ("api/v1/hello") je endpoint - cesta kde se to hledá pokud je prázdné tak je jen lomítko za portem
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
    @RequestMapping(method = RequestMethod.PUT, name = "/de") // stené jako @PutMapping(/de)
    public String updateWord(){
        return "The word was updated";
    }



}
