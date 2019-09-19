package com.fdme.entity;

import lombok.Data;
import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 类描述
 *
 * @author: 王向超 <wstrongtr@163.com>
 */
@Data
public class SecurityUser implements UserDetails,Serializable {

	private static final long serialVersionUID = -6300944154328868874L;
	private Long id;
	private String username;
	private String password;


	public SecurityUser(TUser user) {
		if (user != null) {
			this.setId(user.getId());
			this.setUsername(user.getUsername());
			this.setPassword(user.getPassword());

		}
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		String username = this.getUsername();
		if (username != null) {
			SimpleGrantedAuthority authority = new SimpleGrantedAuthority(username);
			authorities.add(authority);
		}
		return authorities;
	}

	@Override
	public String getUsername() {
		return null;
	}

	//账户是否未过期,过期无法验证
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	//指定用户是否解锁,锁定的用户无法进行身份验证
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	//指示是否已过期的用户的凭据(密码),过期的凭据防止认证
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	//是否可用 ,禁用的用户不能身份验证
	@Override
	public boolean isEnabled() {
		return true;
	}

}
