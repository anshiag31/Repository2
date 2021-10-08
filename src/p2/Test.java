package p2;

public class Test {
    public static void main(String[] args) {
    Exam obj1 = new Exam();
    Exam obj2 = new Exam(56);
    Exam obj3 = new Exam(30, "llb",70);
        obj1.display();
        obj2.display();
        obj3.display();
        System.out.println(obj1.course+" "+obj1.rollno+" "+obj1.marks);

}
}




