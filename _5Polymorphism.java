class A 
{
    void show()
    {
        System.out.println("1");
    }
    void show(int a)
    {
        System.out.println("2");
    }
}
public class _5Polymorphism {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.show(0);
    }
}
