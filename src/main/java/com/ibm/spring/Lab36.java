package com.ibm.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab36 {

    public static void main(String[] args) {



    AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AnnotationConfig.class);
    System.out.println("Spring Container is ready");
    System.out.println("...................");

    Hello hello = (Hello)ctx.getBean("hello");
    hello.show();
    System.out.println("..................");
    System.out.println("Spring Container going to shutdown");
    ctx.registerShutdownHook();
    System.out.println("done");
}

}
