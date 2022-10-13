package Task3;

import java.util.ArrayList;

public class Student extends Person
{
    ArrayList<String> passedCourses;
    ArrayList<String> currentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> passedCourses)
    {
        super(name);
        this.passedCourses = passedCourses;
    }

    @Override
    public boolean addCourse(String course)
    {
        for (int i = 0; i < passedCourses.size(); i++)
        {
            String s = passedCourses.get(i);
            if (s.equalsIgnoreCase(course))
            {
                return false;
            }
        }
        currentCourses.add(course);
        return true;
    }
}
