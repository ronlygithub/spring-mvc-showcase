package com.yonyou.bqcloud.framework.context;

/**
 * 登录用户
 *
 * @author zll
 *
 */
public class WriteableLoginUser implements LoginUser, Cloneable {
	private static final long serialVersionUID = 1L;

	private String uid = null;
	private String tenantUid = null;
	private String firstName = null;
	private String lastName = null;
	private String loginName = null;
	private long loginTime = -1;
	//是否是内部用户。如果是内部用户，用户将没有编辑权限
	private boolean innerUser = true;
	private boolean isAnonymous = false;
	// 是否是免费用户
	private boolean isFree = true;


	@Override
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	@Override
	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	@Override
	public String getTenantUid() {
		return tenantUid;
	}
	public void setTenantUid(String tenantUid) {
		this.tenantUid = tenantUid;
	}
	@Override
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Override
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@Override
	public long getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(long loginTime) {
		this.loginTime = loginTime;
	}
	public void setInnerUser(boolean innerUser) {
		this.innerUser = innerUser;
	}
	@Override
	public boolean isInnerUser() {
		return innerUser;
	}
	@Override
	public boolean isAnonymous() {
		return isAnonymous;
	}
	public void setAnonymous(boolean isAnonymous) {
		this.isAnonymous = isAnonymous;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			//nothing to do
			return null;
		}
	}

}
