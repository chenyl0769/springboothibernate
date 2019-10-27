package com.cyl.springboothibernate.controllers;

import com.cyl.springboothibernate.service.CoserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoserController {
    @Autowired
    private CoserService coserService;

    /**
     * 更新Coser关联的User
     * @return
     */
    @RequestMapping("/updatecoser")
    public String updatecoser(){

        coserService.updateuid(3,1);
        return "success";
    }
}
