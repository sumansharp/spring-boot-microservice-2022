package com.java8.suman.lambdaExpression;

import java.util.function.Function;

class Table{
	int c;
	int d;
	Table(int e, int f){
		c=e;
		d=f;
	}
}
public class Demo4 {

	public static void main(String[] args) {
		
		Function <Integer, Integer> fn=n->n*n;
		
		System.out.println(fn.apply(5));
		System.out.println("====================");
		
		Function <Table, Integer> tb=s->(s.c*s.d);
		
		for(int i=1; i<=20; i++) {
			System.out.println("Table of "+i+":");
			for(int j=1; j<=10; j++) {
				System.out.print(tb.apply(new Table(i,j))+" ");
			}
			System.out.println();
		}
		}
	}


