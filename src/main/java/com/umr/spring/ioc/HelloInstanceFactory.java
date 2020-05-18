package com.umr.spring.ioc;

/**
 * <pre>
 * 任务：
 * @Description
 * @Author lianchaochao
 * @Date 2020/5/15 11:41
 * </pre>
 */
public class HelloInstanceFactory {
    public HelloInstanceFactory() {
        System.out.println("实例工厂方法构造函数");
    }

    // 利用实例工厂方法创建对象
    public HelloIoc getInstance(){
        HelloIoc instanceIoc = new HelloIoc();
        return instanceIoc;
    }
}
