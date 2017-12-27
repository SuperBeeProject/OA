package cn.bdqn.j25.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * 定义包含增强方法的JavaBean
 */
public class Error {
	private static final Logger log = Logger.getLogger(Error.class);

	public void afterThrowing(JoinPoint jp, RuntimeException e) {
		log.error(jp.getSignature().getName() + " 方法发生异常：" + e);
		
	}
}
