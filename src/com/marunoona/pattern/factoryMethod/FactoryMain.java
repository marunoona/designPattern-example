package com.marunoona.pattern.factoryMethod;

import com.marunoona.pattern.factoryMethod.concrete.HpCreator;
import com.marunoona.pattern.factoryMethod.concrete.MpCreator;
import com.marunoona.pattern.factoryMethod.framework.Item;
import com.marunoona.pattern.factoryMethod.framework.ItemCreator;

public class FactoryMain {
    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.useItem();

        creator = new MpCreator();
        item = creator.create();
        item.useItem();
    }
}
