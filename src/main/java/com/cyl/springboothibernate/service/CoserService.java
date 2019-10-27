package com.cyl.springboothibernate.service;

import com.cyl.springboothibernate.entity.Coser;
import org.springframework.stereotype.Service;

@Service
public interface CoserService {

    public Coser findcoserbyid(Integer id);

    public void updateuid(Integer id,Integer uid);
}
