import java.util.Scanner;

public class Person
{
   private String name;
   private int age;
   public Person(String name, int age){
	this.name = name;
      	this.age = age;
   }
   public Person(String name) {
   	this(name,0);
   }
   public Person(int age) {
       	this("unknown",age);
   }
   public Person() {
       	this("unknown",0);
   }
   public void print(){
       	System.out.println("Person's Name: " + name + " " + "Age: "+ age);
   }
   public static void main(String[] args) {
       	Person p1 = new Person();
       	p1.print();

       	Person p2 = new Person("Gabe", 20);
	p2.print();

       	Person p3 = new Person("Anne", 21);
       	p3.print();

   }

}




