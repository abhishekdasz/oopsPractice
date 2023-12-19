public class _2Constructor {
    String name;
    int id;
    _2Constructor(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    public static void main(String[] args) {
        _2Constructor e1 = new _2Constructor("Abhishek", 29);
        System.out.println(e1.name+" "+e1.id);
    }
}
