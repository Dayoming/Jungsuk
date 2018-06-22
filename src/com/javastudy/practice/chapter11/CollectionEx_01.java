package com.javastudy.practice.chapter11;

import java.util.Collection;
import java.util.Iterator;

public class CollectionEx_01 {
    public static void main(String[] args) {
        Collection collection = new Collection() {
            @Override
            public int size() { // Collection에 저장된 객체 개수 반환
                return 0;
            }

            @Override
            public boolean isEmpty() { // Collection이 비어있는지 확인
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }
            // 지정된 객체 또는 Collection의 객체들이 Collection에 포함되어있는지 확인

            @Override
            public Iterator iterator() { // Collection의 Iterator를 얻어서 반환
                return null;
            }

            @Override
            public Object[] toArray() { // Collection에 저장된 객체를 객체배열(Object[])로 반환
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) { // 지정된 배열에 Collection의 객체를 지정해서 반환
                return new Object[0];
            }

            @Override
            public boolean add(Object o) { // Collection에 추가
                return false;
            }

            @Override
            public boolean remove(Object o) { // Collection에서 삭제
                return false;
            }

            @Override
            public boolean containsAll(Collection c) { // 지정된 객체 또는 ...
                return false;
            }

            @Override
            public boolean addAll(Collection c) { // 모두 추가
                return false;
            }

            @Override
            public boolean removeAll(Collection c) { // 지정된 Collection에 포함된 객체들을 삭제
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }
            // 지정된 Collection에 포함된 객체만을 남기고 다른 객체들은 삭제.
            // Collection에 변화가 왔으면 true, 아니면 false 반환

            @Override
            public void clear() { // Collection 모두 비움

            }
        };
    }
}
