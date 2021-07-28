package com.basic.string;

public class RemoveSpace {
	public static void main(String[] args) {
		String str="I Love India";
		System.out.println(str.replaceAll("\\s",""));
		char ch[]=str.toCharArray();
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ' && ch[i]!='\t' ) {
				stringBuffer.append(ch[i]);
			}
		}
		System.out.println(stringBuffer);
	}
}
