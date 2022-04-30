package com.sunglowsys;

import com.sunglowsys.domain.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext();
        context.scan("com.sunglowsys.domain");
        context.refresh();

        Student student = context.getBean(Student.class);

        student.setFirstName("shiley");
        System.out.println(student.getFirstName());

        Student student1 = context.getBean(Student.class);
        Student student2 = context.getBean(Student.class);

        student1.setFirstName("Yashveer");

        student2.setFirstName("Ram");
        System.out.println(student2.getFirstName());
        System.out.println(student1.getFirstName());
        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
