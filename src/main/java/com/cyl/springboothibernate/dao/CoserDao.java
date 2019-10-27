package com.cyl.springboothibernate.dao;

import com.cyl.springboothibernate.entity.Coser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CoserDao extends JpaRepository<Coser,Integer> {
}
