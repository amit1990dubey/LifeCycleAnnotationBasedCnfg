package com.ibm.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanpostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object obj, String bname) throws BeansException {
        System.out.println("PostProcessBeforeInitialization:" +bname);
        return obj;
    }

    public Object postProcessAfterInitialization(Object obj, String bname) throws BeansException {
        System.out.println(" postProcessAfterInitialization" +bname);
        return obj;
    }
}

