package com.belhard.university.util;

public class LinkedList<T> implements DataStructure<T> {

    class Node {
        Node next;
        T data;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    private void isEmpty() {
        if (head == null) {
            throw new RuntimeException("List is empty!");
        }
    }

    @Override
    public boolean add(T data) {
        if (contains(data)) {
            return false;
        }
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return true;
    }

    public boolean remove() {
        Node current = head;

        isEmpty();

        while (current.next != tail || current == tail) {
            if (current == tail) {
                System.out.println("The last element");
                return false;
            } else {
                current = current.next;
            }
        }
        current.next = null;
        tail = current;
        return true;
    }

    public void removeStack() {
        isEmpty();
        head = null;
    }

    @Override
    public int size() {
        Node current = head;
        int size = 0;
        while (current != null) {
            current = current.next;
            size++;
        }
        return size;
    }

    @Override
    public boolean contains(Object data) {
        Node current = head;
        while (current != null) {
            if (data.equals(current.data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Object get(int index) {
        Node current = head;

        if (index < 0) {
            return false;
        }

        for (int i = 0; i < index; i++) {
            if (current.next == null) {
                return false;
            }
            current = current.next;
        }
        return current.data;
    }

    public void display() {
        Node current = head;

        isEmpty();

        System.out.println("Nodes of singly linked list: ");

        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
