package com.hcx.activemq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hongcaixia on 2019/7/15.
 */
public class MyTest {

    public static void main(String[] args) {
        //加载启动spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    }

}
