package com.it.reflection;



public class  ProxyTest {
    public static void main(String[] args) {
        StaticReflection staticReflection = new StaticReflection();
        Display proxyStaticReflection = new ProxyStaticReflection(staticReflection);
        proxyStaticReflection.play();
    }
}

 class ProxyStaticReflection implements Display {
    private Display display;

    public  ProxyStaticReflection (Display display){
        this.display=display;
    }

    @Override
    public void play() {
        System.out.println("代理工厂做代理前的工作");
        display.play();
        System.out.println("代理工厂做代理后的工作");
    }
}


class StaticReflection implements  Display {
    @Override
    public void play() {
        System.out.println("打游戏");
    }
}




