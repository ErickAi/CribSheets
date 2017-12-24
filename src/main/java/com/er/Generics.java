package com.er;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
//    class A<T,W>{
        Object ba = (new Aa<Integer, Object>()).get(2);
        String ca = (new Aa<Integer, String>()).get(1);
//    class A{
        Object[] ab = new Object[10]; Object b = Ab.getFirstValue(ab);
//    class A<T>{
        int bc = (new Ac<Integer>(1)).getA();
        long cc = (new Ac<Integer>(1)).getA();
        Object dc = (new Ac(1)).getA();
//    interface A {}; class B implements A{}; class ArrayListE<T> implements List<T>{};
        List<?> ad = new ArrayList<A>();
        ArrayList<?> bd = new ArrayList<A>();
        List<A> cd = new ArrayList<A>();
    }

}
class Aa<T,W>{
    private Map<T,W> map;
    public W get (T a){
        return map.get(a);
    }
}
class Ab{
    public static <T> T getFirstValue(T[] array) {
        return array[0];
    }
}
class Ac<T>{
    private T a;
    public Ac (T a){
        this.a = a;
    }
    public T getA(){
        return a;
    }
}

interface A {}
class B implements A{}
class ArrayListE<T> implements List<T>{
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
    public Iterator<T> iterator() {
        return null;
    }
    @Override
    public Object[] toArray() {
        return new Object[0];
    }
    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }
    @Override
    public boolean add(T t) {
        return false;
    }
    @Override
    public boolean remove(Object o) {
        return false;
    }
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }
    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }
    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }
    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }
    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }
    @Override
    public void clear() {
    }
    @Override
    public T get(int index) {
        return null;
    }
    @Override
    public T set(int index, T element) {
        return null;
    }
    @Override
    public void add(int index, T element) {
    }
    @Override
    public T remove(int index) {
        return null;
    }
    @Override
    public int indexOf(Object o) {
        return 0;
    }
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }
    @Override
    public ListIterator<T> listIterator() {
        return null;
    }
    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }
    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}

