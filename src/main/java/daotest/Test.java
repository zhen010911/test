package daotest;

import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //启动工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("dao/applicationContext.xml");
        //获取对象
        TestDao testDao = (TestDao) context.getBean("aa");

        testDao.sayHello();
    }

}
