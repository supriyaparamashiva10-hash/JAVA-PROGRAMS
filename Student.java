public class Student
{
    String name;
    int rollno;
    int  age;
    void display()
    {
        System.out.println("name :"+name);
        System.out.println("roll no :"+rollno);
        System.out.println("age :"+age);
        System.out.println();
    }
    public static void main(String[]args)
    {
        Student S1 = new Student();
        Student S2 = new Student();
        S1.name = " supriya";
        S1.rollno = 1;
        S1.age = 19;
        S2.name = (" nichitha");
        S2.rollno = 2;
        S2.age = 19;
        S1. display();
        S2. display();

    }
}
