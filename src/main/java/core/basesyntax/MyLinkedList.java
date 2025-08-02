package core.basesyntax;

import java.util.List;

public class MyLinkedList<T> implements MyLinkedListInterface<T> {
    private static class Node<T> {
        T value;
        Node<T> prev;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(T value, int index) {
    }

    @Override
    public void addAll(List<T> list) {
    }

    @Override
    public T get(int index) {

        return null;
    }

    @Override
    public T set(T value, int index) {

        return null;
    }

    @Override
    public T remove(int index) {

        return null;
    }

    @Override
    public boolean remove(T object) {

        return false;
    }

    @Override
    public int size() {

        return 0;
    }

    @Override
    public boolean isEmpty() {

        return false;
    }
}
