package com.ibm.spring;


import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AnnotationConfig {

    @Bean(name="hello", autowire = Autowire.BY_NAME, initMethod = "myInit", destroyMethod = "mycleanup")

    public Hello hello()
    {
        Hello h = new Hello(99);
        h.setStr("Hello amit");
        return  h;
    }

    @Bean

    public static MyBeanpostProcessor myBeanPostProcesser()
    {
        return new MyBeanpostProcessor();
    }

    @Bean(name="bobj")

    public B getB()
    {
        return new B(88,"spring");
    }

    @Bean(name="AO")

    public A getA()
    {
        A aobj = new A();
        aobj.setA(99);
        aobj.setMsg("amit1");
        return aobj;
    }
}
