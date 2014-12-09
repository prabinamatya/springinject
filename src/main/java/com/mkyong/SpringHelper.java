package com.mkyong;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringHelper implements ApplicationContextAware {

	private static ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringHelper.applicationContext = applicationContext;
	}

	public static <T> T get(Class<T> clazz) {
		return applicationContext.getBean(clazz);
	}

	public static <T> T get(String beanName, Class<T> clazz) {
		return applicationContext.getBean(beanName, clazz);
	}
}
