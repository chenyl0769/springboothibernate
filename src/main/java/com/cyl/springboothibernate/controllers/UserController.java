package com.cyl.springboothibernate.controllers;

import com.cyl.springboothibernate.entity.Coser;
import com.cyl.springboothibernate.entity.User;
import com.cyl.springboothibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.Set;

@Controller

public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 根据用户ID查询用户
     * @return
     */
    @RequestMapping("/fubid")
    @ResponseBody
    public String test(){

        System.out.println(userService.finduserbyid(1));
        return "aaa";
    }

    /**
     * 根据用户名字查询用户，级联查询Coser
     * @return
     */
    @RequestMapping("/fubname")
    @ResponseBody
    public String findbyname(){
        User user = userService.find("cyl");
        System.out.println(user);
        System.out.println("-----------");
        System.out.println(user.getCosers());
        return "bb";
    }

    /**
     * 增加User级联Coser
     * @return
     */
    @RequestMapping("/adduser")
    @ResponseBody
    public String adduser(){
        User user = new User();
        user.setName("zhu");
        user.setPwd("123");
        Coser coser =new Coser();
        coser.setCname("cong");
        coser.setCstr("congstr");
        user.getCosers().add(coser);
        coser.setUser(user);
        //userService.adduser(user);
        userService.saveuser(user);
        return "add";
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping("/deluser")
    @ResponseBody
    public String deleteuser(){
        User user = userService.finduserbyid(83);
        userService.delete(user);
        return "del";
    }

    /**
     * 更新
     * @return
     */
    @RequestMapping("/upuser")
    @ResponseBody
    public String updateuser(){
        User user = userService.finduserbyid(84);
        user.setName("newname");
        userService.updateup(user);
        return "update";
    }
}
