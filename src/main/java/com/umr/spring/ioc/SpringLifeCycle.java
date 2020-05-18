package com.umr.spring.ioc;

/**
 * <pre>
 * 任务：
 * @Description
 * @Author lianchaochao
 * @Date 2020/5/15 15:07
 * </pre>
 */
public class SpringLifeCycle {
    public SpringLifeCycle() {
        System.out.println("SpringLifeCycle constructor");
    }

    // 定义初始化方法
    public void init(){
        System.out.println("init method");
    }

    // 定义销毁方法
    public void destroy(){
        System.out.println("destroy method");
    }

    public void sayHello(){
        System.out.println("Hello,everyone!");
    }
}
