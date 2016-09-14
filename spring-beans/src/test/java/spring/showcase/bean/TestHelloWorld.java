package spring.showcase.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jacky on 2016/9/13.
 */
public class TestHelloWorld {
    private static Logger logger = LogManager.getLogger();
    @Test
    public void TestHelloWorld(){
        logger.debug("Test....");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        HelloWorldBean bean = (HelloWorldBean) context.getBean("helloWorld");
        bean.sayHello();

        bean =  (HelloWorldBean) context.getBean("helloWorld2");
        bean.sayHello();

        Foo foo = (Foo) context.getBean("foo");
        foo.sayHello(foo.getName());

        Bar bar = (Bar) context.getBean("bar");
        bar.performace();

        Annot annot = (Annot) context.getBean("annot");
        annot.sayHello("Peter");

        System.out.println("-----1------");

        Conf conf = (Conf) context.getBean("conf");
        conf.bar().performace();
        conf.noDef().performace();

        System.out.println("-----2------");

        NoDef noDef = (NoDef) context.getBean("noDef");
        noDef.performace();
    }
}
