package com.clubs2win;

/**
 * Created by sumitchawla on 10/18/15.
 */
public class Undergrad extends Student
{

    public Undergrad(String s)
    {
        super(s);
    }

    @Override
    public boolean isPass()
    {
        boolean pass = false;

        if(averageScore() > 40)
        {
            pass = true;
        }

        return pass;
    }
}
