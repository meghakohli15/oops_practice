//static variable
class Student3
{
 int id;
 String name;
 static String clg="SRM";
 Student3(int i,String n)
{
    id=i;
    name=n;
} 
 void display()
{
    System.out.println(id+" "+name+" "+clg);
    
}
}
public class Main
{
public static void main(String args[])
{
Student3 s1=new Student3(4,"ko");
Student3 s2=new Student3(6,"jo");
s1.display();
s2.display();
}
}

static method
class Student3
{
 int id;
 String name;
 static String clg="SRM";
 static void change()
 {
     clg="VIT";
 }
 Student3(int i,String n)
{
    id=i;
    name=n;
} 
 void display()
{
    System.out.println(id+" "+name+" "+clg);
    
}
}
public class Main
{
public static void main(String args[])
{
    Student3.change();
Student3 s1=new Student3(4,"ko");
Student3 s2=new Student3(6,"jo");
s1.display();
s2.display();
}
}
