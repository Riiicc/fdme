package com.fdme.entity;

import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.Tolerate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

/**
 * <p>
 * 
 * </p>
 *
 * @author ric
 * @since 2019-08-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TUser implements Serializable{


    private static final long serialVersionUID = 3361600056877904565L;
    private Long id;
    /**
     * 手机或者用户名或者邮箱
     */
    private String username;

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
