package cz.engeto.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/list")

public class ListOfWordController {
    List<String> listOfWord = new ArrayList<>();
    @GetMapping
    public int getTheLengthOfList(){
        return listOfWord.size();
    }
    @PostMapping("{word}/work")
    public void addOneWordInList(@PathVariable String word){
        listOfWord.add(word);
    }
}
