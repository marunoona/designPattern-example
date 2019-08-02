package com.marunoona.pattern.factoryMethod.concrete;

import com.marunoona.pattern.factoryMethod.framework.Item;

public class HpPotion implements Item {
    @Override
    public void useItem() {
        System.out.println("체력 포션 사용!");
    }
}
