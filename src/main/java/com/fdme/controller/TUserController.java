package com.fdme.controller;


import com.fdme.entity.Result;
import com.fdme.entity.TUser;
import com.fdme.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

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
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;


    @RequestMapping(value = "{userId}",method = RequestMethod.GET)
    public Result getUser(@PathVariable("userId") Long userId){
	    TUser user = itUserService.getById(userId);
        return Result.buildSuccess(user);
    }


    @RequestMapping(value = "signUp",method = RequestMethod.POST)
    public Result getUser(@RequestBody TUser user){
	    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
	    user.setCreateTime(LocalDateTime.now());
        itUserService.save(user);
        return Result.buildSuccess();
    }



}
