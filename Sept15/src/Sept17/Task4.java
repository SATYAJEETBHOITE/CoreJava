package Sept17;

public class Task4 {

	public static void main(String[] args) {
		String s1="Welcome";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
			
		}
		System.out.println("Original String:"+s1);
		System.out.println("Reverse String: "+s2);
		

	}

}
