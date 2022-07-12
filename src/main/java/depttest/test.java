package depttest;

import dept.DeptService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main (String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext("dept/applicationContext.xml");
        DeptService deptService = (DeptService) context.getBean("deptService");
        deptService.get("小明");
    }
}
