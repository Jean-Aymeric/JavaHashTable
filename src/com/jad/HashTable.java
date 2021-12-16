package com.jad;

import java.util.Vector;

public abstract class HashTable<Data extends IHasKey> {
    private final int size;
    private final Vector<Data>[] persons;

    protected HashTable(int size) {
        this.size = size;
        this.persons = new Vector[size];
        for (int i = 0; i < size; i ++) {
            this.persons[i] = new Vector<>();
        }
    }

    public int getSize() {
        return size;
    }

    public void add(Data data) {
        this.persons[hashCode(data.getKey())].add(data);
    }

    protected abstract int hashCode(int key);
}
