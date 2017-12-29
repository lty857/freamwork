package com.lty.freamwork.test;

import com.lty.freamwork.pojo.Eatable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForAop2 {
    public static void main(String arg[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        不采用DefaultAdvisorAutoProxyCreator自动代理
//        Eatable eatable = (Eatable)applicationContext.getBean("userProxy") ;
//        eatable.eat();

//        采用DefaultAdvisorAutoProxyCreator自动代理
        Eatable eatable=(Eatable) applicationContext.getBean("user");
        eatable.eat();
    }
}
