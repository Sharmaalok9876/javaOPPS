// package ENCAPSULATION;

class Student
{
    private int age;
    private String name;

    // set method to set the value bcoz private variable is their
    public void setData()
    {
        age = 18;
        name = "Rahul";
    }
    public void show()
    {
        System.out.println(name+" "+age);
    }
}
public class P2 {
    public static void main(String[] args) {
        Student obj = new Student();
        // assign from outside world
        // obj.age = 18;
        // obj.name = "Rahul";


        // System.out.println(obj.age);
        obj.setData();
        obj.show();
    }
}
