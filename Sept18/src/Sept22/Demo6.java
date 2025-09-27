package Sept22;
class Post{
	int postId;
	String postName;
	
	Post(int postId, String postName){
		this.postId=postId;
		this.postName=postName;
		
		
	}
	void show() {
		System.out.println("post Id:"+postId+"\nPost Name:"+postName);
	}
}

public class Demo6 {

	public static void main(String[] args) {
		Post p=new Post(101,"Java is secure");
		p.show();
		

	}

}
