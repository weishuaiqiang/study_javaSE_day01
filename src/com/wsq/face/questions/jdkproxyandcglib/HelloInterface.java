package com.wsq.face.questions.jdkproxyandcglib;

/**
 * 代理一般分为：JDK静态代理、JDK动态代理、CGLIB动态代理
 * 代理一般实现的模式为JDK静态代理：
 *  1.创建一个接口
 *  2.创建被代理的类并且实现该接口
 *  3，创建代理类，也实现该接口，在代理类中持有一个被代理对象的引用，
 *  而后在代理类方法中调用该对象的方法。
 *
 *  void sayHello();    抽象方法
 * @author 86199
 */

public interface HelloInterface {
    void sayHello();
}
