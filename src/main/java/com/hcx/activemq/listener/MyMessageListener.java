package com.hcx.activemq.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by hongcaixia on 2019/7/15.
 */
public class MyMessageListener implements MessageListener {

    //回调方法，当消息监听器监听到消息后，会自动回调改方法，并且把消息传给该方法
    public void onMessage(Message message) {
        if(message instanceof TextMessage){
            String text = null;
            try {
                text = ((TextMessage) message).getText();
            } catch (JMSException e) {
                e.printStackTrace();
            }
            System.out.println("接收到的消息是："+text);
        }
    }
}
