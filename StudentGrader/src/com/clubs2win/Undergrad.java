package com.clubs2win;

import java.util.Random;

/**
 * Created by sumitchawla on 10/18/15.
 */
public class Undergrad extends Student
{

    public Undergrad(String s)
    {
        super(s);
        // Randomly assign test scores for the 5 tests to the student
        scores = new int[5];

        for (int i=0; i<5;i++)
        {
            Random r = new Random();

            scores[i] = 30 + r.nextInt(30);
        }

    }

    @Override
    public boolean isPass()
    {
        if(averageScore() > 40)
        {
            pass = true;
        }

        return pass;
    }
}
