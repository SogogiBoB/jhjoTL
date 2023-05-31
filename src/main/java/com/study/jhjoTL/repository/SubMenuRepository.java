package com.study.jhjoTL.repository;

import com.study.jhjoTL.model.GlobalMenu;
import com.study.jhjoTL.model.SubMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubMenuRepository extends JpaRepository<SubMenu, Integer> {

}
