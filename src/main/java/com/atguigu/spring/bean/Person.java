package com.atguigu.spring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
//@Component
public class Person implements ApplicationContextAware, MessageSourceAware {
    private String name;
    private Integer age;

    public Person() {
        System.out.println("person创建");
    }

    public void setName(String name) {
        this.name = name;
    }

    // @Autowired
    ApplicationContext applicationContext;
    MessageSourceAware messageSourceAware;
    //@Autowired
    private Cat cat;

    @Lookup
    public Cat getCat() {
        return cat;
    }

    @Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSourceAware = messageSourceAware;
    }
}
