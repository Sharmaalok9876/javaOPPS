// Private & Shadowing Problem

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
public class P3 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();

        obj.setData();
        obj.show();

        obj1.setData();
        obj.show();
    }
}
