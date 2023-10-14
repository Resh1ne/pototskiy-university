package com.belhard.university.util;

interface DataStructure<T> {
    public int size();

    public boolean add(T obj);

    public boolean contains(Object obj);

    public Object get(int index);
}
