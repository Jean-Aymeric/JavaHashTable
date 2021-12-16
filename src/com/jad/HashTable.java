package com.jad;

import java.util.Vector;

public abstract class HashTable<Data extends IHasKey> {
    private final int size;
    private final Vector<Data>[] persons;

    protected HashTable(int size) {
        this.size = size;
        this.persons = (Vector<Data>[]) new Object[size];
    }

    public int getSize() {
        return size;
    }

    public void add(int index, Data data) {
        this.persons[hashCode(data.getKey())].add(data);
    }

    protected abstract int hashCode(int key);
}
