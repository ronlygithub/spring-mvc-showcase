package com.yonyou.bqcloud.framework.context;


/**
 * 涓婁笅鏂�
 * 
 * @author zll
 *
 */
public abstract class Context {
	private static ThreadLocal<Context> currentContext = new ThreadLocal<Context>();
	
	/**
	 * 杩斿洖褰撳墠涓婁笅鏂�
	 * @return
	 */
	public static Context current() {
		Context context = currentContext.get();
		if (context == null) {
			context = new WriteableContext();
			currentContext.set(context);
		}
		
		return context;
	}
	
	/**
	 * 杩斿洖褰撳墠鐢ㄦ埛
	 * @return
	 */
	public abstract LoginUser getLoginUser();

	
	
}