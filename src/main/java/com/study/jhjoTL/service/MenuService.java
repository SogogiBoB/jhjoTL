package com.study.jhjoTL.service;

import com.study.jhjoTL.mapper.MenuMapper;
import com.study.jhjoTL.model.GlobalMenu;
import com.study.jhjoTL.model.Menu;
import com.study.jhjoTL.model.SubMenu;
import com.study.jhjoTL.repository.GlobalMenuRepository;
import com.study.jhjoTL.repository.SubMenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final GlobalMenuRepository globalMenuRepository;
    private final SubMenuRepository subMenuRepository;
    private final MenuMapper menuMapper;

    public List<Menu> selectGmenu() {
        return menuMapper.selectGmenu();
    }

    public List<Menu> selectSmenu() { return menuMapper.selectSmenu();
    }
}
