package com.atguigu.spring.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

public class HelloFactory implements FactoryBean {
    public Object getObject() throws Exception {
        return null;
    }

    public Class<?> getObjectType() {
        return null;
    }
}
