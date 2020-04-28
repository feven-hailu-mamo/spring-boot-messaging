package com.spring.messaging.springbootmessaging;

public interface SmsSender {
    public void sendSms(SmsRequest smsRequest);
}