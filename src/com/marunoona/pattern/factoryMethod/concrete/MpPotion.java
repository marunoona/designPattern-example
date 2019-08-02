package com.marunoona.pattern.factoryMethod.concrete;

import com.marunoona.pattern.factoryMethod.framework.Item;

public class MpPotion implements Item {
    @Override
    public void useItem() {
        System.out.println("마력 포션 사용!");
    }
}
