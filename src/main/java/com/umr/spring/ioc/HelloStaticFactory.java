package com.umr.spring.ioc;

/**
 * <pre>
 * 任务：
 * @Description
 * @Author lianchaochao
 * @Date 2020/5/15 10:06
 * </pre>
 */
public class HelloStaticFactory {
    public HelloStaticFactory() {
        System.out.println("HelloStaticFactory constructor");
    }

    // 静态工厂方法
    public static HelloIoc getInstance(){
        return new HelloIoc();
    }
}
