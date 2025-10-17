package com.design.patterns.structural.proxy;

public interface CacheManager {
    boolean contains(String key);
    String get(String key);
    void put(String key, String value);
}
