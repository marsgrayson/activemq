package com.activemq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReceiverTest {
    public static void main(String[] args) {
        // TODO 自动生成方法存根
    	ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext.xml");
        Receiver receiver = (Receiver) context.getBean("receiver");
        System.out.print(receiver.receiveMessage());
    }
}