package com.basic.string;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Find Maximun and minimum character count";
		int freq[]=new int[str.length()];
		System.out.println(freq.length);
		char minChar=str.charAt(0),maxChar=str.charAt(0);
		//System.out.println("Min Count ="+str.charAt(0));
		int min=0,max=0;
		char strArr[]=str.toCharArray();

	    //Count each word in given string and store in array freq    

		for(int i=0;i<str.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(strArr[i]==strArr[j] && strArr[i]!=' ' && strArr[i]!='0') {
					freq[i]++;
					//System.out.print("f="+freq[i]+" s= "+strArr[i]+strArr[j]+",  ");
	                //Set string[j] to 0 to avoid printing visited character    
					strArr[j]='0';
			
				}
			}
		}
		min=max=freq[0];
		for(int i=0;i<freq.length;i++) {
			if(min>freq[i]) {
				min=freq[i];
				minChar=strArr[i];
			}
			if(max<freq[i]) {
				max=freq[i];
				maxChar=strArr[i];
			}
		}
		System.out.println();
		System.out.println("Min ="+min+" Min Charactr ="+minChar);
		System.out.println("Max ="+max+" Max Charactr ="+maxChar);


	}

}
