package com.study.jhjoTL.mapper;

import com.study.jhjoTL.model.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {

    List<Menu> selectSmenu();

    List<Menu> selectGmenu();
}