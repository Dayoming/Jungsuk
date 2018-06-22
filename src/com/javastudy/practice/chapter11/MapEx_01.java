package com.javastudy.practice.chapter11;

/*
키와 값을 하나의 쌍으로 묶어서 저장하는 컬렉션
기존에 저장된 데이터와 중복된 키와 값을 저장하면 기존의 값은 없어지고 마지막에 저장된 값이 남게 됨
Hashtable, HashMap, LinkedHashMap, SortedMap, TreeMap
*/

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MapEx_01 {
    public static void main(String[] args) {
        Map map = new Map() {

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }
            // 지정된 key객체와 일치하는 Map의 key객체가 있는지 확인

            @Override
            public boolean containsValue(Object value) {
                return false;
            }
            // 지정된 value객체와 일치하는 Map의 value객체가 있는지 확인

            @Override
            public Object get(Object key) {
                return null;
            }
            // 지정한 key객체와 대응하는 value객체 반환

            @Override
            public Object put(Object key, Object value) {
                return null;
            }
            // Map에 value객체를 key객체에 연결하여 저장

            @Override
            public Object remove(Object key) {
                return null;
            }
            // 지정한 key객체와 key-value객체 삭제

            @Override
            public void putAll(Map m) {
            }
            // 지정한 Map의 모든 key-value쌍 추가

            @Override
            public void clear() {
            }

            @Override
            public Set keySet() {
                return null;
            }
            // Map에 저장된 모든 key객체 반환
            // 반환 타입이 Set이므로 중복 불가

            @Override
            public Collection values() {
                return null;
            }
            // Map에 저장된 모든 value객체 반환
            // 반환 타입이 Collection이므로 중복 허용

            @Override
            public Set<Entry> entrySet() {
                return null;
            }
            // Map에 저장되어 있는 key-value 쌍을 Map.Entry타입의 객체로 저장한 Set으로 반환
        };
    }
}
