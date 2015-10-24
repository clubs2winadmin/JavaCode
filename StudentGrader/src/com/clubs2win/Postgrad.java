package com.clubs2win;

/**
 * Created by sumitchawla on 10/18/15.
 */
public class Postgrad extends Student
{
    public Postgrad(String s) {
        super(s);
    }

    @Override
    public boolean isPass()
    {
        boolean pass = false;

        if(averageScore()>50)
        {
            pass = true;
        }

        return pass;
    }
}

