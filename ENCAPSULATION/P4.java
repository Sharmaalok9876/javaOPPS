
class Student
{
    private int age; // instance variable
    private String name;

    // set method to set the value bcoz private variable is their
    public void setData1(int age)
    {
        // this reffer to current object
        this.age = age;
    }
    public void setData2(String name)
    {
        this.name = name;
    }
    public void show()
    {
        System.out.println(name+" "+age);
    }
}
public class P4 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();

        obj.setData1(18);
        obj.setData2("Alok");
        obj.show();

        obj1.setData1(25);
        obj1.setData2("kumar");
        obj1.show();
    }
}
