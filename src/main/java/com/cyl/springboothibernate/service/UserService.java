package com.cyl.springboothibernate.service;

import com.cyl.springboothibernate.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User finduserbyid(Integer id);

    public User find(String name);

    public void adduser(User user);

    public void saveuser(User user);

    public void delete(User user);

    public void updateup(User user);
}
