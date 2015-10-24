package com.clubs2win;

import java.util.Random;

/**
 * Created by sumitchawla on 10/18/15.
 */
public class Student {


    //static variable to keep track of last assigned Student ID
    private static int lastIdUsed = 1000;

    //student name
    protected String name;

    //student ID
    protected int id;

    protected boolean pass;

    public int[] scores;




    // constructor
    public Student(String s)
    {
        name =s;

        //assign the student the next available student ID
        id = ++lastIdUsed;
        pass = false;

        // Randomly assign test scores for the 5 tests to the student
        scores = new int[5];

        for (int i=0; i<5;i++)
        {
            Random r = new Random();
            scores[i] = r.nextInt(60);
        }

    }

    //getter for name
    public String getName()
    {
        return name;
    }

    //getter for ID
    public int getId()
    {
        return  id;

    }

    // Calculates average score for this student
    public int averageScore()
    {
        int sum=0;

        for(int i=0;i<5;i++)
        {
            sum+=scores[i];
        }

        return sum/5;
    }


    public boolean isPass()
    {
        // Implement this method in derived classes - remember to override it for derived classes

        System.out.println("Base class' isPass method should never be called");
        return pass;

    }


}
