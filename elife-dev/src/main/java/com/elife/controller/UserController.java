package com.elife.controller;


import com.elife.entity.User;
import com.elife.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihf
 * @since 2019-11-11
 */
@Controller
@RequestMapping("/user")
public class UserController {
    /**
     *
     */
    @Autowired
    private UserMapper userMapper;

    @GetMapping(value = "/list")
    @ResponseBody
    public Map<String,Object> products(Map<String, Object> map) throws Exception {
//        List<User> users = userMapper.selectList(null);
//
//        System.out.println("users:"+users.toString());
        User user=userMapper.selectById(5);
        System.out.printf("user11:"+user);
        Map<String,Object> retmap=new HashMap<String,Object>();
        retmap.put("user",user);
        return retmap;

    }

}


