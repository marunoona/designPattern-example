package com.marunoona.pattern.singleton;

/**
 * Thread safe Lazy Initialization 게으른 초기화
 * synchronized 특성상 비교적 큰 성능저하가 발생하므로 권장하지 않음
 */
public class SingletonTest04 {
    private static SingletonTest04 instance;
    private SingletonTest04(){}

    public static synchronized  SingletonTest04 getInstance(){
        if(instance == null){
            instance = new SingletonTest04();
        }
        return instance;
    }
}
