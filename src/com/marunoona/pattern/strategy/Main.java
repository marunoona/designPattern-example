package com.marunoona.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();

        //맨손
        character.attack();
        //칼공격
        character.setWeapon(new Knife());
        character.attack();
        //검공격
        character.setWeapon(new Sword());
        character.attack();

    }
}
