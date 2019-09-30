package com.fdme.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fdme.entity.Result;
import com.fdme.entity.TUpcoming;
import com.fdme.entity.TUser;
import com.fdme.service.ITUpcomingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ric
 * @since 2019-09-30
 */
@Controller
@RequestMapping("/v1/upcoming")
public class TUpcomingController {

	@Autowired
	private ITUpcomingService upcomingService;

	/**
	 * 根据userId获取用户下的待办事件列表
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "{userId}",method = RequestMethod.GET)
	public Result getUser(@PathVariable("userId") Long userId){
		Map<String, Object> columnMap  = new HashMap<>();
		columnMap .put("user_id",userId);
		Collection<TUpcoming> tUpcomings = upcomingService.listByMap(columnMap);
		ArrayList<TUpcoming> tUpcomings1 = new ArrayList<>(tUpcomings);
		return Result.buildSuccess(tUpcomings1);
	}
}
