package com.basic.string;
/*Here, our task is to divide the string S into n equal parts. 
We will print an error message if the string cannot be divisible
into n equal parts otherwise all the parts need to be 
printed as the output of the program.*/


public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="aaaabbbbcccc";
		int len=name.length();
		int n=3;
		int chars=len/n;
		System.out.println(chars);
		int temp=0;
		String[] equString=new String[3];
		if(len%n!=0)
			System.out.println("String cannot divided into equal parts");
		else {
			System.out.println("String divided into equal parts");
			for(int i=0;i<len;i=i+chars) {
                //Dividing string in n equal part using substring()  
				//System.out.print("i ="+i);
				String part=name.substring(i, i+chars);
				equString[temp]=part;
				temp++;
			}
				
		}
		for(int i=0;i<equString.length;i++)
			System.out.println(equString[i]);
	}
	

}
