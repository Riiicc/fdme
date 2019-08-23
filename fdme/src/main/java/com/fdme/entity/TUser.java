package com.fdme.entity;

import com.fdme.entity;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ric
 * @since 2019-08-23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class TUser extends entity {

    private static final long serialVersionUID = 1L;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 状态
     */
    private String motto;

    /**
     * 密码
     */
    private String password;

    /**
     * 昵称
     */
    private String name;

    /**
     * 性别(1男，0女，2保密)
     */
    private Integer gender;

    /**
     * 头像地址
     */
    private String filePath;

    /**
     * 生日
     */
    private LocalDateTime birthday;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 当前积分
     */
    private Integer points;

    private String token;

    /**
     * 积分总数
     */
    private Integer totalPoints;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 用户最后一次登录时间
     */
    private LocalDateTime lastLoginTime;


}
