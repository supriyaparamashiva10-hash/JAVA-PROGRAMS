 class Stud
 {
     int marks;

     Stud(int marks)
     {
         this.marks = marks;
     }
 }
public class s
{
    static void change(int x, Stud s)
    {
        x = 100;
        s.marks = 95;
        s = new Stud(50);

    }

    public static void main(String[] args)
    {
        int n = 20;
        Stud st = new Stud(60);
        change(n, st);
        System.out.println(n);
        System.out.println(st.marks);
    }

}