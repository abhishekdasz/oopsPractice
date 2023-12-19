class A 
{
    void outputA () 
    {
        System.out.println("A class");
    }
}
class B extends A
{
    void outputB () 
    {
        System.out.println("B class");
    }
}
class C extends A
{
    void outputC () 
    {
        System.out.println("C class");
    }
}
public class _4HierarchicalInheritance {
    public static void main(String[] args) {
        C objc = new C();
        objc.outputC();
        objc.outputA();


        B objb = new B();
        objb.outputB();
        objb.outputA();

        A obja = new A();
        obja.outputA();
    }
}
