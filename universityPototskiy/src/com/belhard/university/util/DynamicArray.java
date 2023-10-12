package com.belhard.university.util;

import java.util.Arrays;

public class DynamicArray implements InterfaceDynamicArray {
    private Object[] arr = new Object[5];
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(Object obj) {
            if (size == arr.length) {
                arr = Arrays.copyOf(arr, arr.length + 5);
            }
            arr[size++] = obj;
            return true;
    }

    @Override
    public boolean remove(Object obj) {
        Object[] newArr = Arrays.copyOf(arr, arr.length);
        int newIndex = 0;
        boolean alreadyThere = false;
        for(int i = 0; i<arr.length; i++) {
            if(!obj.equals(arr[i])) {
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
        for(int i = 0; i<arr.length; i++) {
            if(arr[i].equals(obj)) {
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

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(arr, size);
    }

}
