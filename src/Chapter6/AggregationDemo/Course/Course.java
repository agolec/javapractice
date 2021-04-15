package Chapter6.AggregationDemo.Course;

import Chapter6.AggregationDemo.Instructor.Instructor;
import Chapter6.AggregationDemo.TextBook.TextBook;

public class Course
{
    private String courseName;
    private Instructor instructor;
    private TextBook textBook;

    public Course(String name, Instructor instr, TextBook text){
        courseName = name;

        instructor = new Instructor(instr);

        textBook = new TextBook(text);
    }

    public String getName(){

        return courseName;
    }

    public Instructor getInstructor(){

        return new Instructor(instructor);
    }

    public TextBook getTextBook(){

        return new TextBook(textBook);
    }

    public String toString(){
        String str = "course name: " + courseName
                + "\nChapter6.AggregationDemo.Instructor Information:\n"
                + instructor
                + "\nTextbook information:\n"
                + textBook;

        return str;
    }

}
