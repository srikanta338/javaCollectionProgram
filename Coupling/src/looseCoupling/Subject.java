package looseCoupling;
 interface Topic{
	 public void understand();
 }
 
 class Topic1 implements Topic{

	@Override
	public void understand() {
		// TODO Auto-generated method stub
		System.out.println("got it..");
	}
	 
 }
 
 class Topic2 implements Topic{

	@Override
	public void understand() {
		// TODO Auto-generated method stub
		System.out.println("understand...");
		
	}
	 
 }
public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Topic t=new Topic1();
		t.understand();
		
		Topic t1=new Topic2();
		t1.understand();

	}

}
