package Task3;

import java.util.ArrayList;

public class Teacher extends Person
{
    ArrayList<String> canTeach;
    ArrayList<String> currentCourses = new ArrayList<>();

    public Teacher(String name, ArrayList<String> canTeach)
    {
        super(name);
        this.canTeach = canTeach;
    }

    @Override
    public boolean addCourse(String course)
    {
        for (int i = 0; i < canTeach.size(); i++)
        {
            String s = canTeach.get(i);
            if (s.equalsIgnoreCase(course))
            {
                currentCourses.add(course);
                return true;
            }
        }
        return false;
    }
}
