package com.fdme.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fdme.entity.SecurityUser;
import com.fdme.entity.TUser;
import com.fdme.service.ITUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 类描述
 *
 * @author: 王向超 <wstrongtr@163.com>
 */
@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    private ITUserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        TUser user = userService.getOne(new QueryWrapper<TUser>().eq("username", s));
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return new SecurityUser(user);
    }
}
