package com.cyl.springboothibernate.service;

import com.cyl.springboothibernate.dao.UserDao;
import com.cyl.springboothibernate.entity.Coser;
import com.cyl.springboothibernate.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User finduserbyid(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public User find(String name) {
        return userDao.findBy(name);
    }

    @Override
    public void adduser(User user) {
        userDao.adduser(user);

    }

    /**
     * 通过JpaRepository的save方法添加用户
     * @param user
     */
    @Override
    public void saveuser(User user) {

        userDao.save(user);
    }

    /**
     * 删除用户
     * @param user
     */
    @Override
    public void delete(User user) {
        userDao.deleteById(user.getId());
    }

    /**
     * 更新用户
     * @param user
     */
    @Override
    public void updateup(User user) {
        userDao.save(user);
    }
}
