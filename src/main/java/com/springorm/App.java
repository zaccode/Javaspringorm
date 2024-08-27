package com.springorm;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.StudentDao;
import com.springorm.entities.Student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        Student student = new Student(2,"Sahil Borole","Pune");
        int res = studentDao.insert(student);
        System.out.println(res);
    }
}
