package com.jad;

public class Main {

    public static void main(String[] args) {
	    HashTable<Person> myHashTable = new HashTable<Person>(10) {
            @Override
            protected int hashCode(final int key) {
                return 0;
            }
        };
        myHashTable.add(new Person("JAD", 47));
    }
}
