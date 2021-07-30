package com.basic.string;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String duplicateString="Duplicate String";
		int count;
		char ch[]=duplicateString.toCharArray();
		for(int i=0;i<duplicateString.length();i++) {
			count=1;
			for(int j=i+1;j<duplicateString.length();j++) {
				//count++;
				if(ch[i]==ch[j] && ch[i]!=' ') {
					
				    count++;
                    //Set string[j] to 0 to avoid printing visited character    

					ch[j]='0';
				}
			}
            //A character is considered as duplicate if count is greater than 1    

			if(count>1 && ch[i]!='0')
				System.out.println(ch[i]);
			    //System.out.print(" "+ch[i]);
		}
		

	}

}
