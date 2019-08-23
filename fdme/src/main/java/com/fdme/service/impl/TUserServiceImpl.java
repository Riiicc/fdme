package com.fdme.service.impl;

import com.fdme.entity.TUser;
import com.fdme.mapper.TUserMapper;
import com.fdme.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ric
 * @since 2019-08-23
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
