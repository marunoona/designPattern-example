package com.marunoona.pattern.singleton;

/**
 * Initialization on demand holder idiom (holder에 의한 초기화)
 * 클래스안에 클래스(Holder)를 두어 JVM의 Class loader 매커니즘과
 * Class가 로드되는 시점을 이용한 방법
 */
public class Singleton02 {
    private Singleton02(){
    }

    private static class LazyHolder{
        public static final Singleton02 INSTACNE = new Singleton02();
    }
    public static Singleton02 getInstance(){
        return LazyHolder.INSTACNE;
    }
}
