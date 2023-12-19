class Animal 
{
    void eat() 
    {
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal
{
    void run() 
    {
        System.out.println("Dog is running");
    }
}
public class _3Inheritance extends Animal {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.run();
    }
}
