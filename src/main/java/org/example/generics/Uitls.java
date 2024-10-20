package org.example.generics;

public class  Uitls<K,V> {
    private K key;
    private V values;
    public Uitls(K key, V values)
    {
        this.key = key;
        this.values = values;
    }
    public void printKeyValues()
    {
        System.out.println("the key is: " + this.key + " and value is: " + this.values);
    }
}
