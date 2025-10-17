package com.design.patterns.structural.proxy;

public class DatabaseDataSourceProxy implements DataSource {

    private final DataSource database;
    private final CacheManager cache;

    public DatabaseDataSourceProxy(CacheManager cache) {
        this.database = new DatabaseDataSource();
        this.cache = cache;
    }

    @Override
    public String getData(String key) {
        if (cache.contains(key)) {
            System.out.println("Cache hit for key: " + key);
            return cache.get(key);
        }

        System.out.println("Cache miss for key: " + key + ". Querying database...");
        String data = database.getData(key);
        cache.put(key, data);
        return data;
    }
}
