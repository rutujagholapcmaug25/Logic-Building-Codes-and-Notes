class Parent{
	public int age = 50;
	public String name = "Papa";
	
	public void print(){
		System.out.println(name + ": " + age );
	}
}

public class Child{
	public static void main(String args[]){
		Parent objParent = new Parent();
		System.out.println(objParent.name);
		System.out.println(objParent.age);
		objParent.print();
	}
}
