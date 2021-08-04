package com.sunxu.java.lru;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/9 14:42
 */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int CACHE_SIZE;

    public LRUCache(int cacheSize) {
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        this.CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > CACHE_SIZE;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(5);
        lruCache.put("sunxu", "孙许");
        lruCache.put("zhangsan", "张三");
        lruCache.put("lisi", "李四");
        lruCache.put("wangwu", "王五");
        lruCache.put("wangsisi", "王思思");
        System.out.println(lruCache);
        lruCache.put("zhaosi", "赵四");
        System.out.println(lruCache);
    }
}
