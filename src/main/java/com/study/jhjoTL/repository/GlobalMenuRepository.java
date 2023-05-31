package com.study.jhjoTL.repository;

import com.study.jhjoTL.model.GlobalMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GlobalMenuRepository extends JpaRepository<GlobalMenu, Integer> {

}
