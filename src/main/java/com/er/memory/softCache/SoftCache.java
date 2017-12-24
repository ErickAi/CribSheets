package com.er.memory.softCache;

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
Метод AnyObject get(Long key) должен возвращать объект типа AnyObject
из мапы cacheMap по ключу key. Если такого ключа в cacheMap нет - верни null.
 */
public class SoftCache <T>{
    private Map<Long, SoftReference<T>> cacheMap = new ConcurrentHashMap<>();

    public int getMapSize(){
        return cacheMap.size();
    }
    public  T get(Long key) {
        SoftReference<T> softReference = cacheMap.get(key);
        if (softReference == null) return null;
        return softReference.get();
    }
/*
Метод AnyObject put(Long key, AnyObject value) должен добавлять в мапу пару
key : value. Метод должен вернуть null, если в cacheMap по такому ключу ранее не было значения.
Иначе - верни предыдущее значение value по этому ключу.
Не забудь вызвать метод clear() у объекта типа SoftReference<AnyObject>.

 */
    public T put(Long key, T value) {
        SoftReference<T> softReference = cacheMap.put(key, new SoftReference<>(value));
        if (softReference == null) return null;

        T result = softReference.get();
        softReference.clear();
        return result;
    }
/*
Метод AnyObject remove(Long key) должен удалить из мапы cacheMap пару key : value по ключу key.
Метод должен вернуть null, если в cacheMap по такому ключу ранее не было значения.
Иначе - верни предыдущее значение value по этому ключу.
Не забудь вызвать метод clear() у объекта типа SoftReference<AnyObject>.

 */
    public T remove(Long key) {
        SoftReference<T> softReference = cacheMap.remove(key);
        if (softReference == null) return null;

        T result = softReference.get();
        softReference.clear();
        return result;
    }
}