package com.cyl.springboothibernate.service;

import com.cyl.springboothibernate.dao.CoserDao;
import com.cyl.springboothibernate.dao.UserDao;
import com.cyl.springboothibernate.entity.Coser;
import com.cyl.springboothibernate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoserServiceImp implements CoserService {
    @Autowired
    private CoserDao coserDao;
    @Autowired
    private UserDao userDao;

    @Override
    public Coser findcoserbyid(Integer id) {
        return coserDao.getOne(id);
    }

    @Override
    public void updateuid(Integer id, Integer uid) {
        Coser coser= findcoserbyid(id);
        User user = userDao.findUserById(uid);
        coser.setUser(user);
        coserDao.save(coser);
    }
}
