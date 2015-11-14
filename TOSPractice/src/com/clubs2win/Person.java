package com.clubs2win;

/**
 * Created by sumitchawla on 11/14/15.
 */
public class Person
{
    private int age;
    private String name;

    public Person (int i,  String s)
    {
        age = i;
        name = s;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
