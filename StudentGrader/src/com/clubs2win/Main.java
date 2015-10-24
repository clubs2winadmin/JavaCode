package com.clubs2win;

public class Main
{

    public static void main(String[] args)
    {
        Student[] students = createSampleData();

        // Iterate over students and print  their name, id,
        // whether they are postgrad or undergrad,their average score,
        // and if they passed or failed

        for(int i=0;i<students.length;i++)
        {
            Student s=students[i];

            System.out.println("Name= "+s.getName()+" ID= "+s.getId()+
                    " StudentType:"+s.getClass().getSimpleName()+
                    " AvgScore:"+s.averageScore()+" Passed="+s.isPass());
        }

    }

    public static Student[] createSampleData() {

        // Create an array  of students : 10 undergrad and 9 postgrad students
        Student[] students = new Student[19];

        for (int i = 0; i < 10; i++)
        {
            students[i] = new Undergrad("Student#" + i);

        }

        for (int i = 10; i < 19; i++)
        {
            students[i] = new Postgrad("Student#" + i);
        }

        // Return the student array
        return students;
    }

}
