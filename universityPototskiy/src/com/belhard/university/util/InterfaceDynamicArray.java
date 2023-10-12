package com.belhard.university.util;

interface InterfaceDynamicArray {
    public int size();

    public boolean add(Object obj);

    public boolean remove(Object obj);

    public boolean contains(Object obj);

    public Object get(int index);

    public Object[] toArray();
}
