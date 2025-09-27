package Septe15;

public class Task5 {

	public static void main(String[] args) {
		int a[]= {3,4,5,8,9,1,11};
		int max=a[0];
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Minimum element:"+min);
		System.out.println("Maximum element:"+max);

	}

}
