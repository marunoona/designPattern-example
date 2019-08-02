package com.marunoona.pattern.strategy;

/**
 * [스트레티지 패턴]
 * 여러 알고리즘을 하나의 추상적인 접근점을 만들어
 * 접근점에서 서로 교환 가능하도록 하는 패턴
 */

public class GameCharacter {
    //접근점(전략을 가지는것임)
    private Weapon weapon;

    //교환 가능(원하는 공격 종류를 지정하기 때문에 교환가능 이라는 개념으로 쓰는 것 같음)
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        if (weapon == null)
            System.out.println("맨손 공격!!!");
        else
            //델리게이트
            weapon.attack();
    }

}
