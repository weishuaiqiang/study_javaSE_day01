package com.wsq.face.questions.jdkproxyandcglib;

/**
 * 代理类
 * 实现了HelloInterface接口
 * 代理类为被代理类 预处理消息，过滤消息 并在此之后将消息转发给 被代理类，
 * 之后还能进行消息的后置处理。
 * 代理类和被代理类通常会存在关联关系（即持有的被代理对象的引用），代理类
 * 本身不实现服务，而是通过调用被代理类中的方法来提供服务。
 *
 * @author 86199
 */

public class HelloProxy implements HelloInterface {
    private HelloInterface helloInterface = new Hello();

    @Override
    public void sayHello(){
        System.out.println("代理类 代理之前。");
        helloInterface.sayHello();
        System.out.println("代理类 代理之后。");
    }
}
