/*
 * package com.java5; class A{ A a1() { return this; } void print() {
 * System.out.println("A1"); }
 * 
 * } class A1 extends A{
 * 
 * @Override A a1() { return this; } void print() { System.out.println("A2"); }
 * } class A2 extends A1{
 * 
 * @Override A a1() { return this; }
 * 
 * @Override void print() { System.out.println("A3"); } }
 * 
 * public class CovaiantNType {
 * 
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub A
 * a=new A(); a.a1().print(); A1 a1 = new A1(); a1.a1().print(); A2 a2 = new
 * A2(); a2.a1().print();
 * 
 * }
 * 
 * }
 */