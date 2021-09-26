//default constructor
class Bike
{
  Bike1()
  {
    System.ou.println("riding the bike");
  }
}
pubic class Mian
{
  public static void main(String[] args)
  {
    Bike1 b=new Bike1();
  }
}
                         
//parameteried constructor
class Student3
{
 int id;
 String name;
 Student3(int i,String n)
{
    id=i;
    name=n;
} 
 void display()
{
    System.out.println(id+" "+name);
    
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
