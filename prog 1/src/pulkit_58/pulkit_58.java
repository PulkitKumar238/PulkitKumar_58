package pulkit_58;


class Dog {
	 String name,breed;
	 Dog(String name,String breed)
	 {
	 this.name=name;
	 this.breed=breed;
	 }
	 void set(String name,String breed)
	 {
	 this.name=name;
	 this.breed=breed;
	 }
	 void display()
	 {
	 System.out.println("Dog name is "+name+"\n"+"Breed is "+breed);
	 }}
public class pulkit_58{
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Dog m=new Dog("abc","austrian");
	m.set("xyz", "swedish");
	m.display();
	}}
	

