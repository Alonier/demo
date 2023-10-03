package Sungkuyl_database.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/list")
    public String list(Model model){
        return "/board/list";
    }

    @GetMapping("write")
    public String write(){
        return "board/write";
    }

    @GetMapping("/join")
    public String join(){
        return "/member/join"
    }
}
