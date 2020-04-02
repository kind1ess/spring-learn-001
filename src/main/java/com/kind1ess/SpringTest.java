package com.kind1ess;

import com.kind1ess.entity.Student;
import com.kind1ess.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Iterator;

public class SpringTest {
    public static void main(String[] args) {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("springTest.xml");
//        Student student = (Student) ac.getBean("student");
//        System.out.println(student);
//        Date date = new Date();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springTest.xml");
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        System.out.println(teacher);
    }
}
