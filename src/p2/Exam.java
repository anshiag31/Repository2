package p2;

public class Exam {
    int rollno;
    String course;
    int marks; //overloading
    Exam()
    {
        rollno=10;
        course="B.tech";
        marks=90;
    }
    Exam (int rollno, String course, int marks)
    {
        this.rollno = rollno;
        this.marks = marks;
        this.course = course;
    }
    Exam(int rollno)
    {
        this.rollno = rollno;
        course = "MCA";
        marks = 80;
    }
    public void display()
    {
        System.out.println(rollno+" "+course+" "+marks);
    }
}



