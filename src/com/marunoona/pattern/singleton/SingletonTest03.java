package com.marunoona.pattern.singleton;

/**
 * Thread safe lazy initialization + double checked locking
 */
public class SingletonTest03 {
    private volatile  static SingletonTest03 instance;
    private SingletonTest03(){}

    public static SingletonTest03 getInstance(){
        if(instance == null){
            synchronized (SingletonTest03.class){
                if(instance == null)
                    instance = new SingletonTest03();
            }
        }
        return instance;
    }
}
