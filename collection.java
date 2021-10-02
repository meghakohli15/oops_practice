//arraylist
import java.util.*;  
public class Main
{  
 public static void main(String args[])
{  
 ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
 list.add("Ravi");//Adding object in arraylist  
 list.add("Vijay");  
 list.add("Ravi");  
 list.add("Ajay");  
//Traversing list through Iterator  
 Iterator itr=list.iterator();  
 while(itr.hasNext())
{  
 System.out.println(itr.next());  
}  
}  
}  
//linkedlist
import java.util.*;  
public class Main
{   
public static void main(String args[])
{  
LinkedList<String> al=new LinkedList<String>();  
al.add("Ravi");  
al.add("Vijay");  
al.add("Ravi");  
al.add("Ajay");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}    
//vector
import java.util.*;  
public class Main
{   
public static void main(String args[])
{  
Vector<String> v=new Vector<String>();  
v.add("Amit");  
v.add("Amit");  
v.add("Ashish");  
v.add("Garima");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}    
//stack
import java.util.*;  
public class Main
{   
public static void main(String args[])
{  
Stack<String> stack = new Stack<String>();  
stack.push("Amit");  
stack.push("Garvit");  
stack.push("Amit");  
stack.push("Ashish");  
stack.push("Garima");  
stack.pop();  
Iterator<String> itr=stack.iterator();   
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}    
//priority queue
import java.util.*;  
public class Main
{   
public static void main(String args[])
{  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit Sharma");  
queue.add("Vijay Raj");  
queue.add("JaiShankar");  
queue.add("Raj");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}  
//arrayDeque
import java.util.*;  
public class Main
{   
public static void main(String args[])
{  
Deque<String> deque = new ArrayDeque<String>();  
deque.add("Gautam");  
deque.add("Karan");  
deque.add("Ajay");  
//Traversing elements  
for (String str : deque) {  
System.out.println(str); 
}  
}  
}  
//hashset
import java.util.*;  
public class Main
{   
public static void main(String args[])
{  
HashSet<String> set=new HashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
//Traversing elements  
Iterator<String> itr=set.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());   
}  
}  
}  
//linkedhashset
import java.util.*;  
public class Main
{   
public static void main(String args[])
{  
LinkedHashSet<String> set=new LinkedHashSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());   
}  
}  
}  
//treeset
import java.util.*;  
public class Main
{   
public static void main(String args[])
{  
TreeSet<String> set=new TreeSet<String>();  
set.add("Ravi");  
set.add("Vijay");  
set.add("Ravi");  
set.add("Ajay");  
//traversing elements  
Iterator<String> itr=set.iterator(); 
while(itr.hasNext())
{  
System.out.println(itr.next());   
}  
}  
}  
//arraylist output in braces like array
import java.util.*;  
public class Main
{   
public static void main(String args[])
{  
ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
      list.add("Mango");//Adding object in arraylist    
      list.add("Apple");    
      list.add("Banana");    
      list.add("Grapes");    
      //Printing the arraylist object   
      System.out.println(list);  
}  
}  
//Java ArrayList example to add elements
import java.util.*;  
public class Main
{  
 public static void main(String args[]){  
  ArrayList<String> al=new ArrayList<String>();  
           System.out.println("Initial list of elements: "+al);  
           //Adding elements to the end of the list  
           al.add("Ravi");  
           al.add("Vijay");  
           al.add("Ajay");  
           System.out.println("After invoking add(E e) method: "+al);  
           //Adding an element at the specific position  
           al.add(1, "Gaurav");  
           System.out.println("After invoking add(int index, E element) method: "+al);  
           ArrayList<String> al2=new ArrayList<String>();  
           al2.add("Sonoo");  
           al2.add("Hanumat");  
           //Adding second list elements to the first list  
           al.addAll(al2);  
           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);  
           ArrayList<String> al3=new ArrayList<String>();  
           al3.add("John");  
           al3.add("Rahul");  
           //Adding second list elements to the first list at specific position  
           al.addAll(1, al3);  
           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+al);  
             
 }  
}  
//hashset example
import java.util.*;  
class Book {  
int id;  
String name,author,publisher;  
int quantity;  
public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class Main {  
public static void main(String[] args) {  
    HashSet<Book> set=new HashSet<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to HashSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing HashSet  
    for(Book b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  
//javatree set
 System.out.println("Highest Value: "+set.pollFirst());  
         System.out.println("Lowest Value: "+set.pollLast());  
//java map
import java.util.*;  
public class Main
{  
 public static void main(String args[])
 {  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul");  
  //Elements can traverse in any order  
  for(Map.Entry m:map.entrySet())
  {  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  
//enumset
import java.util.*;  
enum days {  
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}  
public class Main {  
  public static void main(String[] args) {  
    Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
    // Traversing elements  
    Iterator<days> iter = set.iterator();  
    while (iter.hasNext())  
      System.out.println(iter.next());  
  }  
}  
//enumset
import java.util.*;  
enum days {  
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}  
public class Main {  
     public static void main(String[] args) {  
    Set<days> set1 = EnumSet.allOf(days.class);  
      System.out.println("Week Days:"+set1);  
      Set<days> set2 = EnumSet.noneOf(days.class);  
      System.out.println("Week Days:"+set2);     
  }  
}  
