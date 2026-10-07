package com;

public class Calculator {
	public void Addition() {
		System.out.println(20+10);
		}
	public void substraction(){
		System.out.println(20-10);
	}
	public void multiplication() {
		System.out.println(20*20);
	}
	public void division(){
		System.out.println(20/10);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.Addition();
		c.multiplication();
		c.division();
		c.substraction();
	}

}
