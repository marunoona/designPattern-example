package com.marunoona.pattern.factoryMethod.concrete;

import com.marunoona.pattern.factoryMethod.framework.Item;
import com.marunoona.pattern.factoryMethod.framework.ItemCreator;

import java.util.Date;

public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemsInfo() {
        System.out.println("데이터베이스에서 체력 아이템 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력 아이템을 새로 생성했습니다." + new Date());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
