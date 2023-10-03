package Sungkuyl_database.demo.controller;

import Sungkuyl_database.demo.dto.BoardDto;
import Sungkuyl_database.demo.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    private BoardService boardService;

    public BoardController(BoardService boardService){
        this.boardService = boardService;
    }

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

    @PostMapping("/post")
    public String write(BoardDto boardDto){
        boardService.savePost(boardDto);
        return "redirect:/";
    }
}
