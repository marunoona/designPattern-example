package com.marunoona.pattern.templateMethod;

import com.marunoona.pattern.templateMethod.helper.AbsGameConnectHelper;
import com.marunoona.pattern.templateMethod.helper.DefaultGameConnecthelper;

/**
 * [템플릿 메소드 패턴]
 * 알고리즘의 구조를 메소드에 정의하고
 * 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의하는 패턴
 *
 * [템플릿 메소드 패턴을 사용할 때]
 * 구현하려는 알고리즘이 일정한 프로세스가 있다.
 * 구현하려는 알고리즘이 변경 사능성이 있다.
 *
 * [템플릿 메소드 구현 단계]
 * 1. 알고리즘을 여러 단계로 나눈다.
 * 2. 나눠진 알고리즘의 단계를 메소드로 선언한다.
 * 3. 알고리즘을 수행할 템플릿 메소드를 만든다.
 * 4. 하위클래스에서 나눠진 메소드들을 구현한다.
 */
public class TemplateMain {
    public static void main(String[] args) throws Exception {
        AbsGameConnectHelper helper = new DefaultGameConnecthelper();
        if(!helper.requestConnection("나의 접속정보")) {
            throw new Exception("접속 오류~!");
        }
    }
}
