package Sungkuyl_database.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/list")
    public String list(){
        return "board/list";
    }

    @GetMapping("/post")
    public String post(){
        return "board/post";
    }
}
