package Septe15;

public class Task4 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,5,4,2,1,};
		System.out.println("Duplicate elements:");
		for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			 if(a[i]==a[j]) {
				 System.out.println(a[i]);
				 break;
			 }
		 }    
		}
		}

	}


