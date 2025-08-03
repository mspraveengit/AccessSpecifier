package org.test.samepackage;

import org.test.differentpackage.GrandParent;
//Parent
public class ParentClass extends GrandParent
{
	//private - class level access specifier(it will support within class)
	private void parent() 
	{
		System.out.println("It is a ParentClass Business Logic");
	}
	public static void main(String[] args) 
	{
		ParentClass pc = new ParentClass();
		pc.parent();
	}
}
