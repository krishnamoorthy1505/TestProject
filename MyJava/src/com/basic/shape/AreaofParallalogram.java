/*A parallelogram is a 4 shaped four-sided flat shaped with opposite sides are 
parallel and equal in length and opposite angles are same as well
       Height X Breadth ( B x H )
*/
package com.basic.shape;

import java.util.Scanner;

public class AreaofParallalogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the H value");
		double height=sc.nextDouble();
		System.out.println("Enter the B value");
		double breath=sc.nextDouble();
		double area=height*breath;
		System.out.println("Area of Parallalogram ="+area);

	}

}
