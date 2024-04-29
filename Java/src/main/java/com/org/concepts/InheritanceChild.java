package com.org.concepts;

public class InheritanceChild extends InhritanceParent
	{
	void sayBye() {
		System.out.println("Will be back soon");
	}
	public static void main(String[] args) {
		InhritanceParent parent = new InhritanceParent();
		parent.hello();//has a relation
		
		InheritanceChild child = new InheritanceChild();
		child.hello();//Is a relation
		
	}
}
