package com.wsq.face.questions.jdkproxyandcglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author 86199
 */
public class Client {
    public static void main(String[] args) {
        /** 静态代理 */
        HelloProxy helloProxy = new HelloProxy();
        helloProxy.sayHello();

        /** JDK动态代理 */
        Hello hello = new Hello();
        InvocationHandler handler = new HelloProxyDynamic(hello);
        HelloInterface helloInterface = (HelloInterface) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
                                            hello.getClass().getInterfaces(),
                                            handler);
        helloInterface.sayHello();
        System.out.println(Math.round(11.5));

    }
}
