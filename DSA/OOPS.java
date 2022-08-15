//Interface Implementations

//1. Applying Multiple Inheritance using Interfaces and Multiple Inheritance is not possible using class in Java

import java.io.*;
import java.util.*;
/*
interface Human {	
	void learn(String str);
	void work();
}
interface Recruitment {
	boolean screening(int score);
	boolean interview(boolean selected);
}
class Programmer implements Human, Recruitment {
	public void learn(String str) {
		System.out.println("Learn using " + str);
	}
	public boolean screening(int score) {
		System.out.println("Attend screening test");
		int thresold = 20;
		if(score > thresold){
		        System.out.println("Cleared screening test");
			return true;
	        }
	        else{
	               System.out.println("Failed screening test"); 
		       return false;
		}
	}
	public boolean interview(boolean selected) {
		System.out.println("Attend interview");
		if(selected){
		        System.out.println("Cleared Interview");
			return true;
	        }
	        else{
	               System.out.println("Failed Interview");
		       return false;
		}
	} 
	public void work() {
		System.out.println("Develop applications");
	}
}

class DevOps implements Human,Recruitment{
             public void learn(String str){
                    System.out.println("Learn using " +str);
             }
             public boolean screening(int score){
                    System.out.println("Attend screening test");
                    int thresold =15;
                    if(score > thresold){
                           System.out.println("Cleared screening");
                           return true;
                    }
                    else{
                           System.out.println("Failed screening");
                           return false;
                    }
             }
             public boolean interview(boolean selected){
                       System.out.println("Attend Interview");
                       if(selected){
                             System.out.println("Cleared Interview");
                             return true;
                       }
                       else{
                             System.out.println("Failed Interview");
                             return false;
                       }
            }
            public void work(){
                   System.out.println("Develops Infrastructure");
            }
}
public class OOPS {
	public static void main(String[] args) {
		Programmer programmer1 = new Programmer();
		programmer1.learn("Coding");
		programmer1.screening(30);
		programmer1.interview(true);
		programmer1.work();
		DevOps devops1 = new DevOps();
		devops1.learn("Scripting");
		devops1.screening(10);
	}
}
*/

//2. Implementing Nested Interfaces in Java

/*
interface OuterInterface{
	void outerMethod();
	
	interface InnerInterface{
		void innerMethod();
	}
}

class OnlyOuter implements OuterInterface{
	public void outerMethod() {
		System.out.println("This is OuterInterface method");
	}
}

class OnlyInner implements OuterInterface.InnerInterface{
	public void innerMethod() {
		System.out.println("This is InnerInterface method");
	}
}

public class OOPS {

	public static void main(String[] args) {
		OnlyOuter obj_1 = new OnlyOuter();
		OnlyInner obj_2 = new OnlyInner();
		
		obj_1.outerMethod();
		obj_2.innerMethod();
	}
}

*/


//3. Implementing Abstract class in Java
/*
abstract class Shape {
	int length, breadth, radius;
	Scanner input = new Scanner(System.in);

	abstract void printArea();

}

class Rectangle extends Shape {
	void printArea() {
		System.out.println("*** Finding the Area of Rectangle ***");
		System.out.print("Enter length and breadth: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Rectangle is: " + length * breadth);
	}
}

class Triangle extends Shape {
	void printArea() {
		System.out.println("\n*** Finding the Area of Triangle ***");
		System.out.print("Enter Base And Height: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Triangle is: " + (length * breadth) / 2);
	}
}

class Cricle extends Shape {
	void printArea() {
		System.out.println("\n*** Finding the Area of Cricle ***");
		System.out.print("Enter Radius: ");
		radius = input.nextInt();
		System.out.println("The area of Cricle is: " + 3.14f * radius * radius);
	}
}

public class OOPS {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.printArea();

		Triangle tri = new Triangle();
		tri.printArea();
		
		Cricle cri = new Cricle();
		
		cri.printArea();
	}
}
*/

//4. Java Program to implement various inheritance types in Java


//Single Inheritance
/*
class ParentClass{
	int a;
	void setData(int a) {
		this.a = a;
	}
}
class ChildClass extends ParentClass{
	void showData() {
		System.out.println("Value of a is " + a);
	}
}
public class OOPS {

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();
		obj.setData(100);
		obj.showData();

	}

}
*/

//Multilevel Inheritance
/*
class ParentClass{
	int a;
	void setData(int a) {
		this.a = a;
	}
}
class ChildClass extends ParentClass{
	void showData() {
		System.out.println("Value of a is " + a);
	}
}
class ChildChildClass extends ChildClass{
	void display() {
		System.out.println("Inside ChildChildClass!");
	}
}
public class OOPS {

	public static void main(String[] args) {

		ChildChildClass obj = new ChildChildClass();
		obj.setData(100);
		obj.showData();
		obj.display();

	}

}
*/

//Hierarhical Inheritance
/*
class ParentClass{
	int a;
	void setData(int a) {
		this.a = a;
	}
}
class ChildClass extends ParentClass{
	void showData() {
		System.out.println("Inside ChildClass!");
		System.out.println("Value of a is " + a);
	}
}
class ChildClassToo extends ParentClass{
	void display() {
		System.out.println("Inside ChildClassToo!");
		System.out.println("Value of a is " + a);
	}
}
public class OOPS {

	public static void main(String[] args) {

		ChildClass child_obj = new ChildClass();
		child_obj.setData(100);
		child_obj.showData();
        
		ChildClassToo childToo_obj = new ChildClassToo();
		childToo_obj.setData(200);
		childToo_obj.display();

	}

}
*/

//Hybrid Inheritance: which is permutation of all the existing type of inheritance we have just seen.


//5. Java Program to implement Polymorphism i.e. method Overloading and Overiding

//Method Overloading

/*
class OOPS {
    static int add(int a, int b){
    return a+b;
    }
    static int add(int a, int b, int c){
    return a+b+c;
    }
    
    public static void main(String args[])
    {
           System.out.println("addition while calling the function with two parameters");
           System.out.println(add(4,9));
           
           System.out.println("addition while calling the func with three parameters");
           System.out.println(add(4,6,9));
           
    }
 */   
    
 //Method Overriding
 
/*
class Animal {

	void eat()
	{
		System.out.println("eat() method of base class");
		System.out.println("eating.");
	}
}

class Dog extends Animal {

	void eat()
	{
		System.out.println("eat() method of derived class");
		System.out.println("Dog is eating.");
	}
}

class OOPS {

	public static void main(String args[])
	{
		Dog d1 = new Dog();
		Animal a1 = new Animal();

		d1.eat();
		a1.eat();

		Animal animal = new Dog();
		// eat() method of animal class is overridden by
		// base class eat()
		animal.eat();
	}
}
*/
    
