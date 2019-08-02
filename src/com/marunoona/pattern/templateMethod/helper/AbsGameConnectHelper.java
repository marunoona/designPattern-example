package com.marunoona.pattern.templateMethod.helper;

public abstract class AbsGameConnectHelper {
    //하위 클래스에서 재정의 해야하기 때문에 private이 아닌 protected로 정의해야함
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String password);
    protected abstract int authorization(String userName);
    protected abstract boolean connection(String info);

    public boolean requestConnection(String encodedInto){

        //1. 보안 과정 -> 암호화 된 문자열을 복호화함
        String decodedInfo = doSecurity(encodedInto);

        //2. 인증 과정 -> 반환된 것을 가지고 아이디, 패스워드를 할당한다.
        String id = "example";
        String password = "password";
        // 아이디와 패스워드가 맞는지 확인
        if(!authentication(id, password)){
            throw  new Error("아이디 암호 불일치");
        }

        //3. 권한 과정
        String userName = "";
        int role = authorization(userName);

        switch (role){
            case 0://게임 매니저
                System.out.println("매니저님 안녕하세요!");
                break;
            case 1://유료 회원
                break;
            case 2://무료 회원
                break;
            case 3://권한 없음
                break;
            default://기타 사항
                break;
        }
        //4. 유저 접속
        return connection(decodedInfo);
    }
}
