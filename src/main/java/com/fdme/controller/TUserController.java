package com.fdme.controller;


import com.fdme.entity.TUser;
import com.fdme.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ric
 * @since 2019-08-23
 */
@RestController
@RequestMapping("/t-user/")
public class TUserController {

    @Autowired
    private ITUserService itUserService;


    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    public List<TUser> getUser(HttpServletRequest request){
        List<TUser> list = itUserService.list();

        itUserService.save(TUser.builder().city("123").createTime(LocalDateTime.now()).build());
        return list;
    }



}
