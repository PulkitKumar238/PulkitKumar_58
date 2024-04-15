package pulkit_58;

class Person{
	String name;
	 int age;
	 Person(String name,int age)
	 { this.name=name;
	 this.age=age;
	 
	 }

void display()
{
System.out.println("name is "+name +" and age is "+age);
}}
public class pulkit {
	public static void main(String[] args)
	{
		Person p1= new Person("pulkit" , 20);
		Person p2= new Person("Kumar" , 20);
		p1.display();
		p2.display();
	}
}