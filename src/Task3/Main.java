package Task3;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("Java 1.0");
        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Java 1.0");

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("Bastian", new ArrayList<>()));
        persons.add(new Student("Tobias", passedCourses));
        persons.add(new Student("Søren", passedCourses));
        persons.add(new Teacher("Signe", canTeach));
        persons.add(new Teacher("Tess", new ArrayList<>()));

        for (Person p : persons)
        {
            if (!p.addCourse("Java 1.0"))
            {
                if (p instanceof Student)
                {
                    System.out.println(p.getName() + " har allerede bestået dette kursus.");
                }
                else if (p instanceof Teacher)
                {
                    System.out.println(p.getName() + " kan ikke undervise i dette fag.");
                }
            }
        }
    }
}
