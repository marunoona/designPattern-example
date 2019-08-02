package com.marunoona.pattern.singleton;

public enum Singleton01 {
    INSTANCE;

    public static Singleton01 getInstance(){
        return INSTANCE;
    }
}
