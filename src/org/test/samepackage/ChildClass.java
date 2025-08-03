package org.test.samepackage;

import org.test.differentpackage.GrandParent;

//Child
public class ChildClass extends ParentClass
{
	private void child() 
	{
		System.out.println("It is Child Class Business Logic");
	}
	public static void main(String[] args) 
	{
		ChildClass cc = new ChildClass();
		cc.child();
//		cc.parent();
//		cc.gparent();
		System.out.println("*****By Using Object*****");
		ParentClass pc = new ParentClass();
//		pc.parent();
		GrandParent gp = new GrandParent();
//		gp.gparent();
	}
}



