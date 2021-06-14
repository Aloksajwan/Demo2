class Student
{
    int rollno;
    String name;
    Student(int r,String n)
    {
        rollno = r;
        name = n;
    }
    void display()
    {
        System.out.println(rollno+" "+name");
    }
}
class S 
{
    public static void main(String[] args) 
{
        Student s1 = new Student(101, "Alok");
        Student s2 = new Student(102, "Happy");
        s1.display();
        s2.display();
    }
}

