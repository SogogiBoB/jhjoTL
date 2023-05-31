package com.study.jhjoTL.controller;

import com.study.jhjoTL.model.Board;
import com.study.jhjoTL.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @RequestMapping("/boardList.do")
    public String selectList(Model model) {
        List<Board> resultList = boardService.selectList();

        model.addAttribute("result", resultList);

        return "board/boardList";
    }
}
