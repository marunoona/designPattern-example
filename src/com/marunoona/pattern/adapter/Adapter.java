package com.marunoona.pattern.adapter;

/**
 *[어댑터 패턴]
 * 한 클래스의 인터페이스를 클라이언트에서 사용하고자 다른 인터페이스로 변환하는 패턴
 */
public interface Adapter {
    //사용 하기를 원하는 기능
    public Float twiceOf(Float f);
    //사용 하기를 원하는 기능
    public Float halfOf(Float f);
}
