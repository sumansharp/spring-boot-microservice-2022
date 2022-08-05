package com.java8.suman.lambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

 class Employee {
	
	String ename;
	int sal;
	int exp;
	Employee(String e, int s, int ex){
		ename=e;
		sal=s;
		exp=ex;
	}
	
	
}
public class Demo3 {

	public static void main(String[] args) {
		Predicate <Employee> emp= (e)->(e.sal>30000 && e.exp>3);

		ArrayList<Employee> empdetail=new ArrayList<Employee>();
		empdetail.add(new Employee("John", 30000,4));
		empdetail.add(new Employee("Deborah", 60000,5));
		empdetail.add(new Employee("Scott", 40000,4));
		empdetail.add(new Employee("Lucent", 60000,4));
		empdetail.add(new Employee("John", 30000,2));
		
		for(Employee e:empdetail) {
			
			if(emp.test(e)) {
				
				System.out.println(e.ename +" "+e.sal);
			}
			
		}
		
	}

}
