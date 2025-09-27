package Sept26;


public class Demo1 {
	int tId;
	String tutorialName;
	boolean isPosted;
	
	Demo1(){
		System.out.println("tutorial Default Constructor");
		
	}
	Demo1(int tId,String tutorialName,boolean isPosted){
		this.tId=tId;
		this.tutorialName=tutorialName;
		this.isPosted=isPosted;
		
		
	}
	void disp() {
		System.out.println("Tutorial Id:"+tId+"\nTutorial Name:"+tutorialName+"\nTutorial is posted or not?:"+isPosted);
	}

	public static void main(String[] args) {
		
			Demo1 d=new Demo1();
			 Demo1 s=new Demo1(101,"Angular is SPA",true);
			 Demo1 b=new Demo1(102,"Java is secure",false);
			 s.disp();
			 b.disp();
			 
		
		

	}

}
