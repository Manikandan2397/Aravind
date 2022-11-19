package constuctor.org;

public class Class {

	public Class() {
		this ("deepak");
		System.out.println("default");}
		
	public Class(String name) {
		this (35);
		System.out.println(name);}
	public Class(int age ) {
		System.out.println(age);}
	public static void main(String[] args) {
		Class a = new Class ();
		
	}
		
		
		
	
		
	
}

