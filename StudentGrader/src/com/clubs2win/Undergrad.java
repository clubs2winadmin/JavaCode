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
        if(averageScore() > 40)
        {
            pass = true;
        }

        return pass;
    }
}
