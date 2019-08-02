package com.marunoona.pattern.templateMethod.helper;

/**
 * 패턴 이해를 위하여
 * 세부적으로 필요한 코딩은 생략하며 하위클래스의 메소드 구현만 보여준다.
 *
 */
public class DefaultGameConnecthelper extends  AbsGameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("아이디/암호 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        return 0;
    }

    @Override
    protected boolean connection(String info) {
        System.out.println("마지막 접속 단계!");
        return true;
    }
}
