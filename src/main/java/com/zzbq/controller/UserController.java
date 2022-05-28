package com.zzbq.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zzbq.common.R;
import com.zzbq.entity.User;
import com.zzbq.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public boolean login(HttpServletRequest request, @RequestBody User user)
    {
        String name = user.getName();
        log.info("用户名",user);
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        /*等值查询对象*/
        queryWrapper.eq(User::getName,user.getName());

        User serviceOne = userService.getOne(queryWrapper);
        if (serviceOne == null)
        {
            return false;
        }
        if (!user.getPwd().equals(serviceOne.getPwd()))
        {
            return false;
        }
        request.getSession().setAttribute("user",serviceOne.getName());
        return true;
    }
}
