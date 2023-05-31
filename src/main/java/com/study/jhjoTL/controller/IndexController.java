package com.study.jhjoTL.controller;

import com.study.jhjoTL.model.GlobalMenu;
import com.study.jhjoTL.model.Menu;
import com.study.jhjoTL.model.SubMenu;
import com.study.jhjoTL.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class IndexController {
    private final MenuService menuService;

    @RequestMapping("/")
    public String Index(Model model) {
        return "index.html";
    }

    @RequestMapping("/menu.do")
    public String menu (Model model) {
        List<Menu> gmenuList = menuService.selectGmenu();
        List<Menu> smenuList = menuService.selectSmenu();

        model.addAttribute("gmenuList", gmenuList);
        model.addAttribute("smenuList", smenuList);

        return "fragment/menu.html";
    }



}
