class Counter
{
    static int count = 0;
    int id;
    static
    {
        System.out.println("static block");
    }
    {
        count++;
        id = count;
        System.out.println("instsnce block:"+id);
    }
    Counter()
    {
        System.out.println("Counter:"+id);
    }
}
class CounterDemo
{
    public static void main(String[]args)
    {
       Counter c1 = new Counter();
       Counter c2 = new Counter();
    }
}