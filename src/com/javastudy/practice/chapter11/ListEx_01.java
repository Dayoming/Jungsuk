package com.javastudy.practice.chapter11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListEx_01 {
    public static void main(String[] args) {
        List list = new List() {

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] a) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(Collection c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection c) {
                return false;
            }

            @Override
            public void clear() {

            }

            // --------------------------------------------------- Collection에서 상속받음

            @Override
            public Object get(int index) { // 지정된 위치에 있는 객체 반환
                return null;
            }

            @Override
            public Object set(int index, Object element) { // 지정된 위치에 객체 저장
                return null;
            }

            @Override
            public void add(int index, Object element) {
            }
            // 지정된 위치에 객체 또는 컬렉션에 포함된 객체 추가

            @Override
            public Object remove(int index) {
                return null;
            }
            // 지정된 위치에 있는 객체 삭제, 삭제된 객체 반환

            @Override
            public int indexOf(Object o) { // 지정된 객체의 위치를 반환(List의 첫 번째 위치부터)
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) { // 지정된 객체의 위치를 반환(List의 마지막 위치부터)
                return 0;
            }

            @Override
            public ListIterator listIterator() { // List의 객체에 접근할 수 있는 ListIterator를 반환
                return null;
            }

            @Override
            public ListIterator listIterator(int index) { // ...
                return null;
            }

            @Override
            public List subList(int fromIndex, int toIndex) { // 지정된 범위에 있는 객체를 반환
                return null;
            }
        };
    }
}
