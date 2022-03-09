package com.java5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) 
@Target(ElementType.METHOD)
@interface MyfAnnotation{
	int value() default 0;
}
public class MyAnnotation {
	@MyfAnnotation(value =10 )
	public void hello() {
		System.out.println("hello");
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		MyAnnotation ma= new MyAnnotation();
		Method m=ma.getClass().getMethod("hello");
		MyfAnnotation ann= m.getAnnotation(MyfAnnotation.class);
		System.out.println(ann.value());
	}

}
