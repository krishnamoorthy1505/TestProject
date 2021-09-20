package com.basic.array;

public class SortingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myarr=new int[] {2,6,3,8,5,9};
		int temp=0;
		System.out.println("Orginal Object");
			for(int i=0;i<myarr.length;i++)
			System.out.print(" "+myarr[i]);
				for(int i=0;i<myarr.length;i++) {
					for(int j=i+1;j<myarr.length;j++) {
						if(myarr[i]<myarr[j]) {
							temp=myarr[i];
							myarr[i]=myarr[j];
							myarr[j]=temp;
						}
						
					}
					
			    }
				System.out.println("Desending order");
				for(int i1=0;i1<myarr.length;i1++)
					System.out.print(" "+myarr[i1]);
		  
	}

}
