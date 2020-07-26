package Chapter6.Course;

import Chapter6.Instructor.Instructor;
import Chapter6.TextBook.TextBook;

public class CourseDemo
{
    public static void main(String[] args)
    {
        Instructor myInstructor = new Instructor("Kramer", "Shawn", "RH3010");

        TextBook myTextBook = new TextBook("Starting out with Java", "Gaddis", "Addison-Wesley");

        Course myCourse = new Course("Intro to Java", myInstructor, myTextBook);

        System.out.println(myCourse);
    }
}
