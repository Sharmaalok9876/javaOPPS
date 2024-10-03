// package ENCAPSULATION;

class Student
{
    int age;
    String name;

    public void show()
    {
        System.out.println(name+" "+age);
    }
}
public class P1 {
    public static void main(String[] args) {
        Student obj = new Student();
        // assign from outside world
        obj.age = 18;
        obj.name = "Rahul";
        obj.show();
    }
}
