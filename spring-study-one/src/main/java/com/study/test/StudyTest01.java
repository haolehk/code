package com.study.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;


public class StudyTest01 {
    private Integer userId;
    private String userName;
    private String createTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/applictionContext-service.xml");
        StudyTest01 studyTest01 = context.getBean("studyTest01",StudyTest01.class);
        System.out.println(studyTest01.getUserId());
        System.out.println(studyTest01.getUserName());
        System.out.println(studyTest01.getCreateTime());
    }
}
