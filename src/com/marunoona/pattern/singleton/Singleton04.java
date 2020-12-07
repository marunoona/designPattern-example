package com.marunoona.pattern.singleton;

/**
 * Thread safe Lazy Initialization 게으른 초기화
 * synchronized 특성상 비교적 큰 성능저하가 발생하므로 권장하지 않음
 */
public class Singleton04 {
    private static Singleton04 instance;

    private Singleton04(){}

    public static synchronized Singleton04 getInstance(){
        if(instance == null){
            instance = new Singleton04();
        }
        return instance;
    }
}
