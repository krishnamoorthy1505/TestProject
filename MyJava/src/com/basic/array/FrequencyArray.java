package com.basic.array;

public class FrequencyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[]=new int[]{1,2,1,3,2,4,5};
			int fr[]=new int[arr.length];
			int visited=-1;
			for(int i=0;i<arr.length;i++){
				int count=1;
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]==arr[j]){
						count++;
	                    //To avoid counting same element again  

						fr[j]=visited;
					}
				}
				if(fr[i]!=visited)
					fr[i]=count;
			}
			for(int i=0;i<fr.length;i++){
				if(fr[i]!=visited)
				System.out.println(" "+arr[i]+"  |   "+fr[i]);
			}
	}

}
