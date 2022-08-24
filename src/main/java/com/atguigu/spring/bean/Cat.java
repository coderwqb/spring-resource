package com.atguigu.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component
public class Cat implements InitializingBean {
    public Cat() {
        System.out.println("Cat被创建了");
    }

    //@Value("罗小黑")
    private String name;

    public String getName() {
        return name;
    }

    @Value("${JAVA_HOME}")
    public void setName(String name) {
        System.out.println("cat的setName正在被调用...");
        this.name = name;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("CatInitializingBean...afterPropertiesSet");
    }
}
