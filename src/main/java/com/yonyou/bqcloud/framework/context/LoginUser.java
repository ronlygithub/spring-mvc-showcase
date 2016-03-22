package com.yonyou.bqcloud.framework.context;

import java.io.Serializable;

/**
 * 登录用户
 * @author zhanglld
 *
 */
public interface LoginUser extends Serializable {

	//匿名用户登录名
	static final String ANONYMOUS_LOGIN_NAME = "anonymous";
	//匿名用户名称
	static final String ANONYMOUS_FIRST_NAME = "anonymous";

	String getUid();

	String getLoginName();

	long getLoginTime();

	String getTenantUid();

	String getFirstName();

	String getLastName();

	boolean isInnerUser();

	boolean isAnonymous();

	boolean isFree();
}