package com.ibm.spring;

import javax.annotation.PostConstruct;

public class A {

    private int a;
    private String msg;

    static
    {
        System.out.println("A-S.B");
    }

    public A()
    {
        System.out.println("A()");
    }

    public void setA(int a)
    {
        this.a=a;
    }

    public void setMsg(String amit1)
    {
        this.msg=msg;
    }

    @PostConstruct

    public void init()
    {
        System.out.println("A-init()");
    }

    public String toString()
    {
        return " " +a+"\t" +msg;
    }
}
