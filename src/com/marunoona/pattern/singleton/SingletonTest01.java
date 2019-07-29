package com.marunoona.pattern.singleton;

public enum SingletonTest01 {
    INSTANCE;

    public static SingletonTest01 getInstance(){
        return INSTANCE;
    }
}
