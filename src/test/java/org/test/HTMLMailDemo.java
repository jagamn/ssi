package org.test;

import java.util.Properties;

import javax.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

/**
 * @author jianghm
 * @date 2015/4/7
 */
public class HTMLMailDemo {

    public static void main(String[] args) throws Exception{
        JavaMailSenderImpl senderImpl = new JavaMailSenderImpl();

        //设定mail server
        senderImpl.setHost("smtp.163.com");

        //建立邮件消息,发送简单邮件和html邮件的区别
        MimeMessage mailMessage = senderImpl.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage);

        //设置收件人，寄件人
        messageHelper.setTo("1276118472@qq.com");
        messageHelper.setFrom("jagamn@163.com");
        messageHelper.setSubject("测试HTML邮件！");
        //true 表示启动HTML格式的邮件
        messageHelper.setText("<html><head></head><body><h1>hello!!spring html Mail</h1></body></html>",true);

        senderImpl.setUsername("jagamn") ; // 根据自己的情况,设置username
        senderImpl.setPassword("19890725jhm") ; // 根据自己的情况, 设置password
        Properties prop = new Properties() ;
        prop.put("mail.smtp.auth", "true") ; // 将这个参数设为true，让服务器进行认证,认证用户名和密码是否正确
        prop.put("mail.smtp.timeout", "25000") ;
        senderImpl.setJavaMailProperties(prop);
        //发送邮件
        senderImpl.send(mailMessage);

        System.out.println("邮件发送成功..");
    }
}
