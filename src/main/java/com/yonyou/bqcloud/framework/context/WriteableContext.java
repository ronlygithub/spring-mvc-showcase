package com.yonyou.bqcloud.framework.context;


/**
 * 可写的上下文
 *
 * @author zhanglld
 *
 */
public class WriteableContext extends Context {
	private String sessionId = null;
	public String getSessionId() {
		return sessionId;
	}



	private LoginUser loginUser = null;
	private LoginUser originLoginUser = null;
	

	public void setLoginUser(LoginUser loginUser) {
		this.loginUser = loginUser;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public LoginUser getLoginUser() {
		if (loginUser == null) {
			loginUser = createNullLoginUser();
		}
		originLoginUser = (LoginUser) ((WriteableLoginUser) loginUser).clone();

		//		if (loginUser == null || ((WriteableLoginUser) loginUser).isAnonymous()) {
		//			SessionInfoInCache sessionInfo = getSession().getAttribute(Session.SESSION_INFO_IN_CACHE_KEY, SessionInfoInCache.class);
		//
		//			if (sessionInfo != null) {
		//				this.loginUser = sessionInfo.getLoginUser();
		//			} else {
		//				this.loginUser = createNullLoginUser();
		//			}

		//			this.originLoginUser = (LoginUser) ((WriteableLoginUser) loginUser).clone();
		//		}

		return loginUser;
	}

	

	/**
	 * 创建空的用户
	 * @return
	 */
	private LoginUser createNullLoginUser() {
		WriteableLoginUser user = new WriteableLoginUser();
		user.setFirstName(LoginUser.ANONYMOUS_FIRST_NAME);
		user.setLoginName(LoginUser.ANONYMOUS_LOGIN_NAME);
		user.setAnonymous(true);
		user.setFree(true);
		return user;
	}

	public void setLoginUser(WriteableLoginUser login) {
		this.loginUser = login;
		
	}

	


	
}