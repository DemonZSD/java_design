package org.mooc.templatepattern;

public class Client {
    /**
     * 具体的spring IOC 框架 使用模板模式，可以分析
     * {@link org.springframework.context.support.AbstractApplicationContext}
     * */
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        RedSoyamilk soyamilk = new RedSoyamilk();
        soyamilk.make();

        System.out.println("制作红枣豆浆");
        JujubeSoyamilk jujubeSoyamilk = new JujubeSoyamilk();
        jujubeSoyamilk.make();
    }


}
