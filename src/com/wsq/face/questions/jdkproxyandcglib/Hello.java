package com.wsq.face.questions.jdkproxyandcglib;

/**
 * 被代理类
 * 实现了HelloInterface接口
 *
 * @author 86199
 */

public class Hello implements HelloInterface {
    @Override
    public void sayHello(){
        System.out.println("被代理类中的sayHello()方法。");
    }
}
