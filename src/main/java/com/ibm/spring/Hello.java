package com.ibm.spring;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Hello implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {


    int x;
    String str;
    String msg;
    String bname;

    @Autowired
    A aobj;

    @Autowired
    B bobj;

    ApplicationContext ctx1;
    BeanFactory factory1;

    @Autowired
    ApplicationContext ctx2;
    @Autowired
    BeanFactory factory2;

    static {
        System.out.println("Hello-S.B");

    }

    public Hello(int x) {
        System.out.println("Hello-(int x)");
        this.x = x;
    }

    public void setStr(String str)
    {
        System.out.println("Hello-setstr()");
        this.str=str;
    }

   public void setBobj(B bobj)
   {
       System.out.println("Hello-setBobj()");
       this.bobj=bobj;
   }

    @PostConstruct

    public void init1() {
        System.out.println("Hello-init1()");
        msg = "Welcome to init method";

        if (str == null) {
            str = "hai gyus";

        }
    }


    @PostConstruct
    public void init2() {
        System.out.println("Hello-init2()");
        msg= "Welcome to init2 method";

        if(str==null)
        {
            str= "Hai gyus";
        }

    }

    public void afterPropertiesSet() throws  Exception
    {
        System.out.println("Hello-afterPropertiesSt()");

        if(str==null)
        {
            str= "Hai Gyus";
        }
    }

    public void myInit()
    {
        System.out.println("Hello-myInit()");
        msg = "WELCOME to myInit method";

        if(str==null)
        {
            str = "Hai gyus";
        }
    }

    public void setBeanName(String bname)
    {
        System.out.println("Hello-setBe name()");
        this.bname=bname;
    }

    public void setBeanFactory(BeanFactory factory1)
    {
        System.out.println("Hello-setBeanFactory()");
        this.factory1=factory1;

    }

    public void setApplicationContext(ApplicationContext ctx1)
    {
        System.out.println("Hello-setApplicationContext()");
    }


    @PreDestroy

    public void cleanup()
    {
        System.out.println("Hello-cleanup()");
    }

    public void destroy() throws  Exception
    {
        System.out.println("Hello-destroy");
    }

    public void mycleanup()
    {
        System.out.println("Hello-myCleanup()");
    }


    public void show()
    {
        System.out.println("Hello-show()");
        System.out.println(x);
        System.out.println(str);
        System.out.println(msg);
        System.out.println(aobj);
        System.out.println(bobj);
        System.out.println("Bean name is " +bname);
        System.out.println(factory1);
        System.out.println(ctx1);
        System.out.println(factory2);
        System.out.println(ctx2);
        System.out.println(ctx1==ctx2);
        System.out.println(factory1==factory2);

    }

}
