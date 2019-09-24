package org.mooc.templatepartten;

public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        RedSoyamilk soyamilk = new RedSoyamilk();
        soyamilk.make();

        System.out.println("制作红枣豆浆");
        JujubeSoyamilk jujubeSoyamilk = new JujubeSoyamilk();
        jujubeSoyamilk.make();
    }
}
