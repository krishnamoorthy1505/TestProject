/* ABC  ACB 
 * BAC BCA
 * CAB CBA
*/

package com.basic.string;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABC";
		int len=str.length();
		getPermutation(str,0,len);

	}

	private static void getPermutation(String str, int i, int len) {
		// TODO Auto-generated method stub
		if(i==len-1) {
			System.out.println(str);
			
		}
		else {
			
			for (int j=i;j<len;j++){
				str=swapString(str,i,j);
				getPermutation(str, i+1, len);
				//System.out.print(" i="+i+" j="+j);
				str=swapString(str,i,j);
				


			}
			
		}
	}

	private static String swapString(String str, int i, int j) {
		// TODO Auto-generated method stub
		char c[]=str.toCharArray();
		char ch;
		ch=c[i];
		c[i]=c[j];
		c[j]=ch;
		return String.valueOf(c);
	}

}
