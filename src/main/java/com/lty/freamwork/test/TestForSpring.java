package com.lty.freamwork.test;

import com.lty.freamwork.pojo.Eatable;
import com.lty.freamwork.pojo.Orders;
import com.lty.freamwork.pojo.QueryUserVo;
import com.lty.freamwork.pojo.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;

public class TestForSpring {
    public static void main(String arg[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        User user = (User) applicationContext.getBean("User");
        Orders orders = new Orders();
        orders=(Orders) applicationContext.getBean("Orders");
        User user=orders.getUser();
        System.out.println(user.getUsername()+" "+user.getPassword());
    }
}