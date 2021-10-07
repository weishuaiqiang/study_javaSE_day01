package com.wsq.face.questions.jdkproxyandcglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Dynamic 动态
 * JDK动态代理
 *
 *
 * @author 86199
 */
public class HelloProxyDynamic implements InvocationHandler {
    private Object subject;

    public HelloProxyDynamic(Object subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理之前 代理类。");
        method.invoke(subject,args);
        System.out.println("代理之后 代理类");
        return null;
    }
}
