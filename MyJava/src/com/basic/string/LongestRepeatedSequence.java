package com.basic.string;

public class LongestRepeatedSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcabc";
		int len=str.length();
		String lrs="";
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				String s=longestRepeatedSequence(str.substring(i, len),str.substring(j, len));
				if(s.length()>lrs.length())
					lrs=s;
			}
		}
		System.out.println(" LRS  "+lrs);

	}

	private static String longestRepeatedSequence(String s, String substring2) {
		// TODO Auto-generated method stub
		int n=Math.min(s.length(), substring2.length());
		for(int i=0;i<n;i++)
		{
			if(s.charAt(i)!=substring2.charAt(i))
				return s.substring(0,i);
		}
		return s.substring(0, n);
		
	}

}
