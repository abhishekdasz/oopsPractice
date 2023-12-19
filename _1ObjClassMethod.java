class Animal 
{
    String color;
    int age;

    void addDetails (String c, int a)
    {
        color = c;
        age = a;
    }
    void displayDetails () 
    {
        System.out.println("Animal details: color:"+color+" age:"+age);
    }
}
class _1ObjClassMethod {
    public void eat() {
        System.out.println("I am eating");
    }

    String name;
    int age;
    public static void main(String[] args) {
        System.out.println("Hello World");
        _1ObjClassMethod obj = new _1ObjClassMethod();
        obj.eat();

        _1ObjClassMethod student1 = new _1ObjClassMethod();
        student1.name = "Abhishek";
        student1.age = 20;

        _1ObjClassMethod student2 = new _1ObjClassMethod();
        student2.name = "Das";
        student2.age = 24;

        System.out.println("Students:");
        System.out.println("Student1:"+" Name:"+ student1.name+ ", Age:"+ student1.age);
        System.out.println("Student2:"+" Name:"+ student2.name+ ", Age:"+ student2.age);    
        
        
        Animal a1 = new Animal();
        a1.addDetails("White", 5);
        a1.displayDetails();
    }
}