package com.belhard.university.util;

import java.util.Arrays;

public class DynamicArray<T> implements DataStructure<T> {
    private Object[] arr = new Object[5];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(T obj) {
        if (contains(obj)) {
            return false;
        }
        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }
        arr[size++] = obj;
        return true;
    }

    public boolean remove(T obj) {
        Object[] newArr = Arrays.copyOf(arr, arr.length);
        int newIndex = 0;
        boolean alreadyThere = false;
        for (int i = 0; i < arr.length; i++) {
            if (!obj.equals(arr[i])) {
                newArr[newIndex] = arr[i];
                newIndex++;
            } else {
                alreadyThere = true;
            }
        }
        size--;
        arr = newArr;
        return alreadyThere;
    }

    @Override
    public boolean contains(Object obj) {
        for (int i = 0; i < arr.length; i++) {
            if (obj.equals(arr[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(int index) {
        if (index >= size || index < 0) {
            throw new RuntimeException("There is no such element!");
        }
        return arr[index];
    }

    public Object[] toArray() {
        return Arrays.copyOf(arr, size);
    }
}
